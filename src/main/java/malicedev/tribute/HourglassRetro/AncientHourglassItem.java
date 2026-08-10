package malicedev.tribute.HourglassRetro;

import net.minecraft.core.block.entity.TileEntityActivator;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.IDispensable;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.world.World;
import net.minecraft.core.world.pos.TilePosc;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class AncientHourglassItem extends Item implements IDispensable {
	public AncientHourglassItem(String name, String namespaceId, int id) {
		super(name, namespaceId, id);
		this.maxStackSize = 64;
	}

	public ItemStack onUse(ItemStack itemstack, World world, Player entityplayer) {
		itemstack.consumeItem(entityplayer);
		world.playSoundAtEntity(entityplayer, entityplayer, "random.bow", 0.1F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		if (!world.isClientSide) {
			world.entityJoinedWorld(new ProjectileHourglassAncient(world, entityplayer));
		}

		return itemstack;
	}

	public void onUseByActivator(ItemStack itemStack, TileEntityActivator activatorBlock, World world, Random random, TilePosc tilePosc, double offX, double offY, double offZ, Direction direction) {
		ProjectileHourglassAncient projectileHourglassAncient = new ProjectileHourglassAncient(world, (double)tilePosc.x() + offX, (double)tilePosc.y() + offY, (double)tilePosc.z() + offZ);
		projectileHourglassAncient.setHeading((double)direction.offsetX() * 0.6, direction.offsetY() == 0 ? 0.1 : (double)direction.offsetY() * 0.6, (double)((float)direction.offsetZ() * 0.6F), 1.1F, 6.0F);
		world.entityJoinedWorld(projectileHourglassAncient);
		--itemStack.stackSize;
	}

	@Override
	public void onDispensed(@NotNull ItemStack selfStack, @NotNull World world, @NotNull Random random, @NotNull Direction direction, double x, double y, double z) {
		ProjectileHourglassAncient entityhourglass = new ProjectileHourglassAncient(world, x, y, z);
		entityhourglass.setHeading((double)direction.offsetX(), (double)direction.offsetY() + 0.1, (double)direction.offsetZ(), 1.1F, 6.0F);
		world.entityJoinedWorld(entityhourglass);
	}
}
