package malicedev.retroifyer.BlockLogic;

import com.mojang.nbt.tags.CompoundTag;
import com.mojang.nbt.tags.ListTag;
import malicedev.retroifyer.ModBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicFurnace;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.motion.CarriedBlock;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryFurnace;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityItem;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.net.packet.Packet;
import net.minecraft.core.net.packet.PacketTileEntityData;
import net.minecraft.core.player.inventory.container.Container;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

import static net.minecraft.core.block.Blocks.LEAVES_OAK;
import static net.minecraft.core.block.Blocks.SAPLING_OAK;

public class TileEntityRetroifyer extends TileEntity implements Container {
	private final Random random = new Random();
	protected ItemStack[] furnaceItemStacks = new ItemStack[2];
	public int currentCookTime = 0;
	public int maxCookTime = 50;

	public int getContainerSize() {
		return this.furnaceItemStacks.length;
	}

	public @Nullable ItemStack getItem(int index) {
		return this.furnaceItemStacks[index];
	}

	public @Nullable ItemStack removeItem(int index, int takeAmount) {
		if (this.furnaceItemStacks[index] != null) {
			if (this.furnaceItemStacks[index].stackSize <= takeAmount) {
				ItemStack itemstack = this.furnaceItemStacks[index];
				this.furnaceItemStacks[index] = null;
				if (this.worldObj != null && index == 1) {
					this.worldObj.markBlockNeedsUpdate(this.x, this.y, this.z);
				}

				return itemstack;
			} else {
				ItemStack itemstack1 = this.furnaceItemStacks[index].splitStack(takeAmount);
				if (this.furnaceItemStacks[index].stackSize <= 0) {
					this.furnaceItemStacks[index] = null;
					if (this.worldObj != null && index == 1) {
						this.worldObj.markBlockNeedsUpdate(this.x, this.y, this.z);
					}
				}

				return itemstack1;
			}
		} else {
			return null;
		}
	}

	public void setItem(int index, @Nullable ItemStack itemstack) {
		this.furnaceItemStacks[index] = itemstack;
		if (itemstack != null && itemstack.stackSize > this.getMaxStackSize()) {
			itemstack.stackSize = this.getMaxStackSize();
		}

		if (this.worldObj != null && index == 1 && itemstack == null) {
			this.worldObj.markBlockNeedsUpdate(this.x, this.y, this.z);
		}

	}

	public String getNameTranslationKey() {
		return "container.retroifyer.name";
	}

	public void readFromNBT(CompoundTag nbttagcompound) {
		super.readFromNBT(nbttagcompound);
		ListTag nbttaglist = nbttagcompound.getList("Items");
		this.furnaceItemStacks = new ItemStack[this.getContainerSize()];

		for(int i = 0; i < nbttaglist.tagCount(); ++i) {
			CompoundTag nbttagcompound1 = (CompoundTag)nbttaglist.tagAt(i);
			byte byte0 = nbttagcompound1.getByte("Slot");
			if (byte0 >= 0 && byte0 < this.furnaceItemStacks.length) {
				this.furnaceItemStacks[byte0] = ItemStack.readItemStackFromNbt(nbttagcompound1);
			}
		}


		this.currentCookTime = nbttagcompound.getShort("CookTime");

	}

	public void writeToNBT(CompoundTag nbttagcompound) {
		super.writeToNBT(nbttagcompound);

		nbttagcompound.putShort("CookTime", (short)this.currentCookTime);

		ListTag nbttaglist = new ListTag();

		for(int i = 0; i < this.furnaceItemStacks.length; ++i) {
			if (this.furnaceItemStacks[i] != null) {
				CompoundTag nbttagcompound1 = new CompoundTag();
				nbttagcompound1.putByte("Slot", (byte)i);
				this.furnaceItemStacks[i].writeToNBT(nbttagcompound1);
				nbttaglist.addTag(nbttagcompound1);
			}
		}

		nbttagcompound.put("Items", nbttaglist);
	}

	public int getMaxStackSize() {
		return 64;
	}

	public int getCookProgressScaled(int i) {
		return this.maxCookTime == 0 ? 0 : this.currentCookTime * i / this.maxCookTime;
	}




	public void tick() {

		boolean furnaceUpdated = false;


		if (this.worldObj == null || !this.worldObj.isClientSide) {
			++this.currentCookTime;
			if (this.currentCookTime == this.maxCookTime) {
				this.currentCookTime = 0;
				this.smeltItem();
				furnaceUpdated = true;
			}


		}

		if (furnaceUpdated) {
			this.setChanged();
		}

	}

	private boolean canSmelt() {
		if (this.furnaceItemStacks[0] == null) {
			return false;
		} else {
			List<RecipeEntryFurnace> list = Registries.RECIPES.getAllFurnaceRecipes();
			ItemStack itemstack = null;
			//RECIPE DEFINITION 1
			if (furnaceItemStacks[0].getItem() == Blocks.GRASS.asItem()) {
				itemstack = Blocks.GRASS_RETRO.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == SAPLING_OAK.asItem()) {
				itemstack = Blocks.SAPLING_OAK_RETRO.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == LEAVES_OAK.asItem()) {
				itemstack = Blocks.LEAVES_OAK_RETRO.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.BRICK_CLAY.asItem()) {
				itemstack = ModBlocks.Bricks_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.CACTUS.asItem()) {
				itemstack = ModBlocks.Cactus_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.ORE_COAL_STONE.asItem()) {
				itemstack = ModBlocks.OreCoal_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.ORE_IRON_STONE.asItem()) {
				itemstack = ModBlocks.OreIron_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.ORE_REDSTONE_STONE.asItem()) {
				itemstack = ModBlocks.OreRedstone_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.ORE_GOLD_STONE.asItem()) {
				itemstack = ModBlocks.Gold_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.ORE_DIAMOND_STONE.asItem()) {
				itemstack = ModBlocks.OreDiamond_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.BLOCK_DIAMOND.asItem()) {
				itemstack = ModBlocks.Diamond_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.BLOCK_GOLD.asItem()) {
				itemstack = ModBlocks.Gold_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.BLOCK_IRON.asItem()) {
				itemstack = ModBlocks.Iron_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.COBBLE_STONE.asItem()) {
				itemstack = ModBlocks.Cobble_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.COBBLE_STONE_MOSSY.asItem()) {
				itemstack = ModBlocks.CobbleMossy_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == ModBlocks.Cobble_BlockRetro.asItem()) {
				itemstack = ModBlocks.Cobble_BlockAncient.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.GRASS_RETRO.asItem()) {
				itemstack = ModBlocks.Grass_BlockAncient.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.PLANKS_OAK.asItem()) {
				itemstack = ModBlocks.Planks_BlockAncient.getDefaultStack();
			}


			if (itemstack == null) {
				return false;
			} else if (this.furnaceItemStacks[1] == null) {
				return true;
			} else if (!this.furnaceItemStacks[1].isItemEqual(itemstack)) {
				return false;
			} else if (this.furnaceItemStacks[1].stackSize < this.getMaxStackSize() && this.furnaceItemStacks[1].stackSize < this.furnaceItemStacks[1].getMaxStackSize()) {
				return true;
			} else {
				return this.furnaceItemStacks[1].stackSize < itemstack.getMaxStackSize();
			}
		}
	}

	public void smeltItem() {
		if (this.canSmelt()) {
			List<RecipeEntryFurnace> list = Registries.RECIPES.getAllFurnaceRecipes();
			ItemStack itemstack = null;
//RECIPE DEFINITION 2
			if (furnaceItemStacks[0].getItem() == Blocks.GRASS.asItem()) {
				itemstack = Blocks.GRASS_RETRO.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == SAPLING_OAK.asItem()) {
				itemstack = Blocks.SAPLING_OAK_RETRO.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == LEAVES_OAK.asItem()) {
				itemstack = Blocks.LEAVES_OAK_RETRO.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.BRICK_CLAY.asItem()) {
				itemstack = ModBlocks.Bricks_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.CACTUS.asItem()) {
				itemstack = ModBlocks.Cactus_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.ORE_COAL_STONE.asItem()) {
				itemstack = ModBlocks.OreCoal_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.ORE_IRON_STONE.asItem()) {
				itemstack = ModBlocks.OreIron_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.ORE_REDSTONE_STONE.asItem()) {
				itemstack = ModBlocks.OreRedstone_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.ORE_GOLD_STONE.asItem()) {
				itemstack = ModBlocks.Gold_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.ORE_DIAMOND_STONE.asItem()) {
				itemstack = ModBlocks.OreDiamond_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.BLOCK_DIAMOND.asItem()) {
				itemstack = ModBlocks.Diamond_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.BLOCK_GOLD.asItem()) {
				itemstack = ModBlocks.Gold_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.BLOCK_IRON.asItem()) {
				itemstack = ModBlocks.Iron_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.COBBLE_STONE.asItem()) {
				itemstack = ModBlocks.Cobble_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.COBBLE_STONE_MOSSY.asItem()) {
				itemstack = ModBlocks.CobbleMossy_BlockRetro.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == ModBlocks.Cobble_BlockRetro.asItem()) {
				itemstack = ModBlocks.Cobble_BlockAncient.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.GRASS_RETRO.asItem()) {
				itemstack = ModBlocks.Grass_BlockAncient.getDefaultStack();
			}
			if (furnaceItemStacks[0].getItem() == Blocks.PLANKS_OAK.asItem()) {
				itemstack = ModBlocks.Planks_BlockAncient.getDefaultStack();
			}

		}
	}



	public boolean stillValid(Player entityplayer) {
		if (this.worldObj != null && this.worldObj.getTileEntity(this.x, this.y, this.z) == this) {
			return entityplayer.distanceToSqr((double)this.x + (double)0.5F, (double)this.y + (double)0.5F, (double)this.z + (double)0.5F) <= (double)64.0F;
		} else {
			return false;
		}
	}

	public void dropContents(World world, int x, int y, int z) {
		super.dropContents(world, x, y, z);
		if (!BlockLogicRetroifyer.keepFurnaceInventory) {
			for(int l = 0; l < this.getContainerSize(); ++l) {
				ItemStack itemstack = this.getItem(l);
				if (itemstack != null) {
					float f = this.random.nextFloat() * 0.8F + 0.1F;
					float f1 = this.random.nextFloat() * 0.8F + 0.1F;
					float f2 = this.random.nextFloat() * 0.8F + 0.1F;

					while(itemstack.stackSize > 0) {
						int i1 = this.random.nextInt(21) + 10;
						if (i1 > itemstack.stackSize) {
							i1 = itemstack.stackSize;
						}

						itemstack.stackSize -= i1;
						EntityItem entityItem = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.itemID, i1, itemstack.getMetadata()));
						float f3 = 0.05F;
						entityItem.xd = (double)((float)this.random.nextGaussian() * f3);
						entityItem.yd = (double)((float)this.random.nextGaussian() * f3 + 0.2F);
						entityItem.zd = (double)((float)this.random.nextGaussian() * f3);
						world.entityJoinedWorld(entityItem);
					}
				}
			}
		}

	}

	public Packet getDescriptionPacket() {
		return this.furnaceItemStacks[1] != null ? new PacketTileEntityData(this) : null;
	}

	public void sortContainer() {
	}

	public void heldTick(World world, Entity holder) {
		this.tick();
	}

	public boolean canBeCarried(World world, Entity potentialHolder) {
		return true;
	}

	public CarriedBlock getCarriedEntry(World world, Entity holder, Block<?> currentBlock, int currentMeta) {
		return super.getCarriedEntry(world, holder, currentBlock, currentMeta & -8 | 2);
	}
}
