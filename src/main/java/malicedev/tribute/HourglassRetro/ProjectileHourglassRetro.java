package malicedev.tribute.HourglassRetro;

import malicedev.tribute.ModBlocks;
import malicedev.tribute.ModItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.projectile.Projectile;
import net.minecraft.core.util.phys.HitResult;
import net.minecraft.core.world.World;

public class ProjectileHourglassRetro extends Projectile {
	public ProjectileHourglassRetro(World world) {
		super(world);
		this.modelItem = ModItems.HourglassRetro;
	}

	public ProjectileHourglassRetro(World world, Mob owner) {
		super(world, owner);
		this.modelItem = ModItems.HourglassRetro;
	}

	public ProjectileHourglassRetro(World world, double x, double y, double z) {
		super(world, x, y, z);
		this.modelItem = ModItems.HourglassRetro;
	}

	@Override
	public void onHit(HitResult hitResult) {
		super.onHit(hitResult);
		int hitY = (int)hitResult.location.y();
		int hitX = (int)hitResult.location.x();
		int hitZ = (int)hitResult.location.z();
		world.playSoundAtEntity(this, this, "random.glass", 0.5F, 0.7F);
		int radius = 7;
		for (int _y = hitY - radius; _y <= hitY + radius; _y++) {
			for (int _x = hitX - radius; _x <= hitX + radius; _x++) {
				for (int _z = hitZ - radius; _z <= hitZ + radius; _z++) {
					int diffX = _x - hitX;
					int diffY = _y - hitY;
					int diffZ = _z - hitZ;
					if ((diffY * diffY + diffX * diffX + diffZ * diffZ) > radius * radius) continue; // If the block is outside the sphere then skip
					Block<?> b = world.getBlock(_x, _y, _z);
					if (b == Blocks.GRASS||b == ModBlocks.Grass_BlockAncient||b == Blocks.GRASS_SCORCHED) {world.setBlock(_x, _y, _z, Blocks.GRASS_RETRO.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.LEAVES_OAK||b == Blocks.LEAVES_SHRUB||b == Blocks.LEAVES_BIRCH||b == Blocks.LEAVES_CACAO||b == Blocks.LEAVES_EUCALYPTUS||b == Blocks.LEAVES_PALM||b == Blocks.LEAVES_PINE||b == Blocks.LEAVES_THORN) {world.setBlock(_x, _y, _z, Blocks.LEAVES_OAK_RETRO.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.LOG_OAK||b == Blocks.LOG_OAK_MOSSY||b == Blocks.LOG_BIRCH	||b == Blocks.LOG_EUCALYPTUS||b == Blocks.LOG_PALM||b == Blocks.LOG_PINE||b == Blocks.LOG_THORN) {world.setBlock(_x, _y, _z, Blocks.LOG_OAK.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.SAPLING_OAK || b == Blocks.SAPLING_SHRUB || b == Blocks.SAPLING_BIRCH || b == Blocks.SAPLING_CACAO || b == Blocks.SAPLING_EUCALYPTUS || b == Blocks.SAPLING_PALM || b == Blocks.SAPLING_PINE || b == Blocks.SAPLING_THORN) {world.setBlock(_x, _y, _z, Blocks.SAPLING_OAK_RETRO.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.GRANITE || b == Blocks.BASALT || b == Blocks.PERMAFROST || b == Blocks.LIMESTONE) {world.setBlock(_x, _y, _z, Blocks.STONE.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.COBBLE_GRANITE || b == Blocks.COBBLE_BASALT || b == Blocks.COBBLE_PERMAFROST || b == Blocks.COBBLE_LIMESTONE || b == Blocks.COBBLE_STONE ||b == ModBlocks.Cobble_BlockAncient) {world.setBlock(_x, _y, _z, ModBlocks.Cobble_BlockRetro.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.COBBLE_STONE_MOSSY) {world.setBlock(_x, _y, _z, ModBlocks.CobbleMossy_BlockRetro.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.ORE_COAL_GRANITE || b == Blocks.ORE_COAL_BASALT || b == Blocks.ORE_COAL_PERMAFROST || b == Blocks.ORE_COAL_LIMESTONE || b == Blocks.ORE_COAL_STONE) {world.setBlock(_x, _y, _z, ModBlocks.OreCoal_BlockRetro.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.ORE_IRON_GRANITE || b == Blocks.ORE_IRON_BASALT || b == Blocks.ORE_IRON_PERMAFROST || b == Blocks.ORE_IRON_LIMESTONE || b == Blocks.ORE_IRON_STONE) {world.setBlock(_x, _y, _z, ModBlocks.OreIron_BlockRetro.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.ORE_GOLD_GRANITE || b == Blocks.ORE_GOLD_BASALT || b == Blocks.ORE_GOLD_PERMAFROST || b == Blocks.ORE_GOLD_LIMESTONE || b == Blocks.ORE_GOLD_STONE) {world.setBlock(_x, _y, _z, ModBlocks.OreGold_BlockRetro.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.ORE_REDSTONE_GRANITE || b == Blocks.ORE_REDSTONE_BASALT || b == Blocks.ORE_REDSTONE_PERMAFROST || b == Blocks.ORE_REDSTONE_LIMESTONE || b == Blocks.ORE_REDSTONE_STONE) {world.setBlock(_x, _y, _z, ModBlocks.OreRedstone_BlockRetro.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.ORE_DIAMOND_GRANITE || b == Blocks.ORE_DIAMOND_BASALT || b == Blocks.ORE_DIAMOND_PERMAFROST || b == Blocks.ORE_DIAMOND_LIMESTONE || b == Blocks.ORE_DIAMOND_STONE) {world.setBlock(_x, _y, _z, ModBlocks.OreDiamond_BlockRetro.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.BRICK_CLAY||b == ModBlocks.Brick_Ancient) {world.setBlock(_x, _y, _z, ModBlocks.Bricks_BlockRetro.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.CACTUS) {world.setBlock(_x, _y, _z, ModBlocks.Cactus_BlockRetro.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.BLOCK_DIAMOND) {world.setBlock(_x, _y, _z, ModBlocks.Diamond_BlockRetro.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.BLOCK_GOLD) {world.setBlock(_x, _y, _z, ModBlocks.Gold_BlockRetro.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.BLOCK_IRON) {world.setBlock(_x, _y, _z, ModBlocks.Iron_BlockRetro.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Planks_BlockAncient) {world.setBlock(_x, _y, _z, Blocks.PLANKS_OAK.id()/*retro equivalent of block b*/);world.markBlockNeedsUpdate(_x, _y, _z);}




				}
			}
		}
	}
}

