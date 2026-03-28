package malicedev.retroifyer.HourglassRetro;

import net.minecraft.core.block.entity.TileEntityActivator;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.entity.projectile.ProjectileSnowball;
import net.minecraft.core.item.IDispensable;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.world.World;

import java.util.Random;

public class HourglassItem extends Item implements IDispensable {
	public HourglassItem(String name, String namespaceId, int id) {
		super(name, namespaceId, id);
		this.maxStackSize = 64;
	}

	public ItemStack onUseItem(ItemStack itemstack, World world, Player entityplayer) {
		itemstack.consumeItem(entityplayer);
		world.playSoundAtEntity(entityplayer, entityplayer, "random.glass", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		if (!world.isClientSide) {
			world.entityJoinedWorld(new ProjectileHourglassRetro(world, entityplayer));
		}

		return itemstack;
	}

	public void onUseByActivator(ItemStack itemStack, TileEntityActivator activatorBlock, World world, Random random, int blockX, int blockY, int blockZ, double offX, double offY, double offZ, Direction direction) {
		ProjectileHourglassRetro projectileHourglassRetro = new ProjectileHourglassRetro(world, (double)blockX + offX, (double)blockY + offY, (double)blockZ + offZ);
		projectileHourglassRetro.setHeading((double)direction.getOffsetX() * 0.6, direction.getOffsetY() == 0 ? 0.1 : (double)direction.getOffsetY() * 0.6, (double)((float)direction.getOffsetZ() * 0.6F), 1.1F, 6.0F);
		world.entityJoinedWorld(projectileHourglassRetro);
		--itemStack.stackSize;
	}

	public void onDispensed(ItemStack itemStack, World world, double x, double y, double z, int xOffset, int yOffset, int zOffset, Random random) {
		ProjectileSnowball entityhourglass = new ProjectileSnowball(world, x, y, z);
		entityhourglass.setHeading((double)xOffset, (double)yOffset + 0.1, (double)zOffset, 1.1F, 6.0F);
		world.entityJoinedWorld(entityhourglass);
	}
}
