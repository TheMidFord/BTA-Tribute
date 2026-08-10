package malicedev.tribute.HourglassRetro;

import malicedev.tribute.ModBlocks;
import malicedev.tribute.ModItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.projectile.Projectile;
import net.minecraft.core.util.phys.HitResult;
import net.minecraft.core.world.World;

public class ProjectileHourglassNormal  extends Projectile {
	public ProjectileHourglassNormal(World world) {
		super(world);
		this.modelItem = ModItems.HourglassNormal;
	}

	public ProjectileHourglassNormal(World world, Mob owner) {
		super(world, owner);
		this.modelItem = ModItems.HourglassNormal;
	}

	public ProjectileHourglassNormal(World world, double x, double y, double z) {
		super(world, x, y, z);
		this.modelItem = ModItems.HourglassNormal;
	}

	@Override
	public void onHit(HitResult hitResult) {
		super.onHit(hitResult);
		int hitY = (int)hitResult.location.y();
		int hitX = (int)hitResult.location.x();
		int hitZ = (int)hitResult.location.z();
		world.playSoundAtEntity(this, this, "random.glass", 0.5F, 1F);
		int radius = 7;
		for (int _y = hitY - radius; _y <= hitY + radius; _y++) {
			for (int _x = hitX - radius; _x <= hitX + radius; _x++) {
				for (int _z = hitZ - radius; _z <= hitZ + radius; _z++) {
					int diffX = _x - hitX;
					int diffY = _y - hitY;
					int diffZ = _z - hitZ;
					if ((diffY * diffY + diffX * diffX + diffZ * diffZ) > radius * radius) continue; // If the block is outside the sphere then skip
					Block<?> b = world.getBlock(_x, _y, _z);
					if (b == Blocks.GRASS_RETRO||b == ModBlocks.Grass_BlockAncient) {world.setBlock(_x, _y, _z, Blocks.GRASS.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.LEAVES_OAK_RETRO) {world.setBlock(_x, _y, _z, Blocks.LEAVES_OAK.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.SAPLING_OAK_RETRO) {world.setBlock(_x, _y, _z, Blocks.SAPLING_OAK.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Cobble_BlockRetro || b == ModBlocks.Cobble_BlockAncient) {world.setBlock(_x, _y, _z, Blocks.COBBLE_STONE.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.CobbleMossy_BlockRetro) {world.setBlock(_x, _y, _z, Blocks.COBBLE_STONE_MOSSY.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.OreCoal_BlockRetro) {world.setBlock(_x, _y, _z, Blocks.ORE_COAL_STONE.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.OreIron_BlockRetro) {world.setBlock(_x, _y, _z, Blocks.ORE_IRON_STONE.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.OreGold_BlockRetro) {world.setBlock(_x, _y, _z, Blocks.ORE_GOLD_STONE.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.OreRedstone_BlockRetro) {world.setBlock(_x, _y, _z, Blocks.ORE_REDSTONE_STONE.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.OreDiamond_BlockRetro) {world.setBlock(_x, _y, _z, Blocks.ORE_DIAMOND_STONE.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Bricks_BlockRetro||b == ModBlocks.Brick_Ancient) {world.setBlock(_x, _y, _z, Blocks.BRICK_CLAY.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Cactus_BlockRetro) {world.setBlock(_x, _y, _z, Blocks.CACTUS.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Diamond_BlockRetro) {world.setBlock(_x, _y, _z, Blocks.BLOCK_DIAMOND.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Gold_BlockRetro) {world.setBlock(_x, _y, _z, Blocks.BLOCK_GOLD.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Iron_BlockRetro) {world.setBlock(_x, _y, _z, Blocks.BLOCK_IRON.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Planks_BlockAncient) {world.setBlock(_x, _y, _z, Blocks.PLANKS_OAK.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					/// CLOTHS///
					else if (b == ModBlocks.Cotton_Cloth) {world.setBlockAndMetadataWithNotify(_x, _y, _z, Blocks.WOOL.id(),(0));world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Overcast_Cloth) {world.setBlockAndMetadataWithNotify(_x, _y, _z, Blocks.WOOL.id(),(8));world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Thundercloud_Cloth) {world.setBlockAndMetadataWithNotify(_x, _y, _z, Blocks.WOOL.id(),(7));world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Crimson_Cloth) {world.setBlockAndMetadataWithNotify(_x, _y, _z, Blocks.WOOL.id(),(14));world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Tangerine_Cloth) {world.setBlockAndMetadataWithNotify(_x, _y, _z, Blocks.WOOL.id(),(1));world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Banana_Cloth) {world.setBlockAndMetadataWithNotify(_x, _y, _z, Blocks.WOOL.id(),(4));world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Lime_Cloth) {world.setBlockAndMetadataWithNotify(_x, _y, _z, Blocks.WOOL.id(),(5));world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Azure_Cloth) {world.setBlockAndMetadataWithNotify(_x, _y, _z, Blocks.WOOL.id(),(3));world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Indigo_Cloth) {world.setBlockAndMetadataWithNotify(_x, _y, _z, Blocks.WOOL.id(),(11));world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Violet_Cloth ) {world.setBlockAndMetadataWithNotify(_x, _y, _z, Blocks.WOOL.id(),(10));world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Magenta_Cloth) {world.setBlockAndMetadataWithNotify(_x, _y, _z, Blocks.WOOL.id(),(2));world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == ModBlocks.Rose_Cloth) {world.setBlockAndMetadataWithNotify(_x, _y, _z, Blocks.WOOL.id(),(6));world.markBlockNeedsUpdate(_x, _y, _z);}

				}
			}
		}
	}
}

