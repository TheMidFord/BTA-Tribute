//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package malicedev.retroifyer;

import java.util.List;

import malicedev.retroifyer.BlockLogic.TileEntityRetroifyer;
import net.minecraft.core.InventoryAction;
import net.minecraft.core.crafting.ContainerListener;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.player.inventory.container.ContainerInventory;
import net.minecraft.core.player.inventory.menu.MenuAbstract;
import net.minecraft.core.player.inventory.slot.Slot;
import net.minecraft.core.player.inventory.slot.SlotFurnace;


public class MenuRetroifyer extends MenuAbstract {
	public static final int ID_CURRENT_COOK_TIME = 0;
	public static final int ID_MAX_COOK_TIME = 2;
	public TileEntityRetroifyer retroifyer;
	private int currentCookTime = 0;
	private int itemCookTime = 0;

	public MenuRetroifyer(ContainerInventory inventory, TileEntityRetroifyer tileEntity) {
		this.retroifyer = tileEntity;
		this.addSlot(new Slot(tileEntity, 0, 56, 35));
		this.addSlot(new SlotFurnace(inventory.player, tileEntity, 1, 116, 35));

		for(int i = 0; i < 3; ++i) {
			for(int k = 0; k < 9; ++k) {
				this.addSlot(new Slot(inventory, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
			}
		}

		for(int j = 0; j < 9; ++j) {
			this.addSlot(new Slot(inventory, j, 8 + j * 18, 142));
		}

	}

	public void broadcastChanges() {
		super.broadcastChanges();

		for(ContainerListener crafter : this.containerListeners) {
			if (this.currentCookTime != this.retroifyer.currentCookTime) {
				crafter.updateCraftingInventoryInfo(this, 0, this.retroifyer.currentCookTime);
			}

			if (this.itemCookTime != this.retroifyer.maxCookTime) {
				crafter.updateCraftingInventoryInfo(this, 2, this.retroifyer.maxCookTime);
			}

		}

		this.currentCookTime = this.retroifyer.currentCookTime;
		this.itemCookTime = this.retroifyer.maxCookTime;
	}

	public void setData(int id, int value) {
		switch (id) {
			case 0:
				this.retroifyer.currentCookTime = value;
				break;
			case 1:
				this.retroifyer.maxCookTime = value;
				break;
		}

	}

	public boolean stillValid(Player entityplayer) {
		return this.retroifyer.stillValid(entityplayer);
	}

	public List<Integer> getMoveSlots(InventoryAction action, Slot slot, int target, Player player) {
		if (slot.index >= 0 && slot.index <= (3-1)) {
			return this.getSlots(slot.index, 1, false);
		} else {
			if (action == InventoryAction.MOVE_ALL) {
				if (slot.index >= 2 && slot.index <= (30-1)) {
					return this.getSlots(2, 27, false);
				}

				if (slot.index >= (30-1) && slot.index <= (38-1)) {
					return this.getSlots((30-1), 9, false);
				}
			}

			return slot.index >= 2 && slot.index <= (38-1) ? this.getSlots(2, 36, false) : null;
		}
	}

	public List<Integer> getTargetSlots(InventoryAction action, Slot slot, int target, Player player) {
		if (slot.index >= 2 && slot.index <= 39) {
			if (action != InventoryAction.MOVE_ALL) {
				if (target == 1) {
					return this.getSlots(0, 1, false);
				}

				if (target == 2) {
					return this.getSlots(1, 1, false);
				}
			}

			if (slot.index >= 2 && slot.index <= 29) {
				return this.getSlots((30-1), 9, false);
			}

			if (slot.index >= 31 && slot.index <= (38-1)) {
				return this.getSlots(2, 27, false);
			}
		}

		if (slot.index >= 0 && slot.index <= 2) {
			return slot.index == 2 ? this.getSlots(2, 36, true) : this.getSlots(2, 36, false);
		} else {
			return null;
		}
	}
}
