package malicedev.tribute.BlockLogic;

import malicedev.tribute.Tags.ModBlockTags;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.material.Materials;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.entity.vehicle.EntityBoat;
import net.minecraft.core.entity.vehicle.EntityMinecart;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.IBonemealable;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.pos.TilePosc;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class BlockLogicCactusRetro extends BlockLogic implements IBonemealable {
	public BlockLogicCactusRetro(Block<?> block) {
		super(block, Materials.CACTUS);
		block.setTicking(true);
		float f = 0.0625F;
		this.setBlockBounds((double)f, (double)0.0F, (double)f, (double)(1.0F - f), (double)1.0F, (double)(1.0F - f));
	}

	public void onBlockPlacedByWorld(World world, int x, int y, int z) {
		this.onNeighborBlockChange(world, x, y, z, 0);
	}

	public void updateTick(World world, int x, int y, int z, Random rand) {
		if (world.isAirBlock(x, y + 1, z)) {
			int cactusHeight;
			for(cactusHeight = 1; world.getBlockId(x, y - cactusHeight, z) == this.block.id(); ++cactusHeight) {
			}

			if (cactusHeight < 3) {
				int i1 = world.getBlockMetadata(x, y, z);
				if (i1 == 15) {
					world.setBlockWithNotify(x, y + 1, z, this.block.id());
					world.setBlockMetadataWithNotify(x, y, z, 0);
				} else {
					world.setBlockMetadataWithNotify(x, y, z, i1 + 1);
				}
			}
		}

	}

	public void growCactusOnTop(World world, int x, int y, int z) {
		int l;
		for(l = 1; world.getBlockId(x, y + l, z) == this.block.id(); ++l) {
		}

		if (world.isAirBlock(x, y + l, z)) {
			world.setBlockWithNotify(x, y + l, z, this.block.id());
		}

	}

	public boolean isCubeShaped() {
		return false;
	}

	public boolean isSolidRender() {
		return false;
	}

	public boolean canPlaceBlockAt(World world, int x, int y, int z) {
		return !super.canPlaceBlockAt(world, x, y, z) ? false : this.canBlockStay(world, x, y, z);
	}

	public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
		if (!this.canBlockStay(world, x, y, z)) {
			this.dropBlockWithCause(world, EnumDropCause.WORLD, x, y, z, world.getBlockMetadata(x, y, z), (TileEntity)null, (Player)null);
			world.setBlockWithNotify(x, y, z, 0);
		}

	}

	public boolean canBlockStay(World world, int x, int y, int z) {
		if (world.getBlockMaterial(x - 1, y, z).isSolid()) {
			return false;
		} else if (world.getBlockMaterial(x + 1, y, z).isSolid()) {
			return false;
		} else if (world.getBlockMaterial(x, y, z - 1).isSolid()) {
			return false;
		} else if (world.getBlockMaterial(x, y, z + 1).isSolid()) {
			return false;
		} else if (world.getBlockId(x, y - 1, z) == Blocks.CACTUS.id() ) {
			return false;
		} else {
			int l = world.getBlockId(x, y - 1, z);
			return Blocks.hasTag(l, ModBlockTags.GROWS_CACTI_RETRO);
		}
	}

	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		if (entity instanceof Mob || entity instanceof EntityMinecart || entity instanceof EntityBoat) {
			entity.hurt((Entity)null, 1, DamageType.COMBAT);
		}

	}

	public boolean onBonemealUsed(ItemStack itemstack, @Nullable Player player, World world, TilePosc tilePosc, Side side, double xPlaced, double yPlaced) {
		if (!world.isClientSide) {
			this.growCactusOnTop(world, tilePosc.x(), tilePosc.y(), tilePosc.z());
			if (player == null || player.getGamemode().hasBlockConsumption()) {
				--itemstack.stackSize;
			}
		}

		return true;
	}
}
