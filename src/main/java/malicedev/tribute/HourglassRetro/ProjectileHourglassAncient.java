package malicedev.tribute.HourglassRetro;

import malicedev.tribute.ModBlocks;
import malicedev.tribute.ModItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.projectile.Projectile;
import net.minecraft.core.util.phys.HitResult;
import net.minecraft.core.world.World;

public class ProjectileHourglassAncient  extends Projectile {
	public ProjectileHourglassAncient(World world) {
		super(world);
		this.modelItem = ModItems.HourglassAncient;
	}

	public ProjectileHourglassAncient(World world, Mob owner) {
		super(world, owner);
		this.modelItem = ModItems.HourglassAncient;
	}

	public ProjectileHourglassAncient(World world, double x, double y, double z) {
		super(world, x, y, z);
		this.modelItem = ModItems.HourglassAncient;
	}

	@Override
	public void onHit(HitResult hitResult) {
		super.onHit(hitResult);
		int hitY = (int)hitResult.location.y();
		int hitX = (int)hitResult.location.x();
		int hitZ = (int)hitResult.location.z();
		world.playSoundAtEntity(this, this, "random.glass", 0.5F, 0.1F);

		int radius = 7;
		for (int _y = hitY - radius; _y <= hitY + radius; _y++) {
			for (int _x = hitX - radius; _x <= hitX + radius; _x++) {
				for (int _z = hitZ - radius; _z <= hitZ + radius; _z++) {
					int diffX = _x - hitX;
					int diffY = _y - hitY;
					int diffZ = _z - hitZ;
					if ((diffY * diffY + diffX * diffX + diffZ * diffZ) > radius * radius) continue; // If the block is outside the sphere then skip
					Block<?> b = world.getBlock(_x, _y, _z);
					if (b == Blocks.GRASS||b == Blocks.GRASS_RETRO) {world.setBlock(_x, _y, _z, ModBlocks.Grass_BlockAncient.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.PLANKS_OAK||b == Blocks.PLANKS_OAK_PAINTED) {world.setBlock(_x, _y, _z, ModBlocks.Planks_BlockAncient.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.COBBLE_STONE||b == ModBlocks.Cobble_BlockRetro) {world.setBlock(_x, _y, _z, ModBlocks.Cobble_BlockAncient.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.BRICK_CLAY||b == ModBlocks.Bricks_BlockRetro) {world.setBlock(_x, _y, _z, ModBlocks.Brick_Ancient.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					/// CLOTHS///
					else if (b == Blocks.WOOL && world.getBlockMetadata(_x, _y, _z) == 0) {world.setBlock(_x, _y, _z, ModBlocks.Cotton_Cloth.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.WOOL && world.getBlockMetadata(_x, _y, _z) == 8) {world.setBlock(_x, _y, _z, ModBlocks.Overcast_Cloth.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.WOOL && world.getBlockMetadata(_x, _y, _z) == 7) {world.setBlock(_x, _y, _z, ModBlocks.Thundercloud_Cloth.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.WOOL && world.getBlockMetadata(_x, _y, _z) == 14) {world.setBlock(_x, _y, _z, ModBlocks.Crimson_Cloth.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.WOOL && world.getBlockMetadata(_x, _y, _z) == 1) {world.setBlock(_x, _y, _z, ModBlocks.Tangerine_Cloth.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.WOOL && world.getBlockMetadata(_x, _y, _z) == 4) {world.setBlock(_x, _y, _z, ModBlocks.Banana_Cloth.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.WOOL && world.getBlockMetadata(_x, _y, _z) == 5) {world.setBlock(_x, _y, _z, ModBlocks.Lime_Cloth.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					/// SKIP SOUR_APPLE NEEDS RECIPE///
					/// SKIP MINT NEEDS RECIPE///
					/// SKIP TURQUOISE NEEDS RECIPE///
					else if (b == Blocks.WOOL && world.getBlockMetadata(_x, _y, _z) == 3) {world.setBlock(_x, _y, _z, ModBlocks.Azure_Cloth.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.WOOL && world.getBlockMetadata(_x, _y, _z) == 11) {world.setBlock(_x, _y, _z, ModBlocks.Indigo_Cloth.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.WOOL && world.getBlockMetadata(_x, _y, _z) == 10) {world.setBlock(_x, _y, _z, ModBlocks.Violet_Cloth.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					/// SKIP LAVENDER NEEDS RECIPE///
					else if (b == Blocks.WOOL && world.getBlockMetadata(_x, _y, _z) == 2) {world.setBlock(_x, _y, _z, ModBlocks.Magenta_Cloth.id());world.markBlockNeedsUpdate(_x, _y, _z);}
					else if (b == Blocks.WOOL && world.getBlockMetadata(_x, _y, _z) == 6) {world.setBlock(_x, _y, _z, ModBlocks.Rose_Cloth.id());world.markBlockNeedsUpdate(_x, _y, _z);}




				}
			}
		}
	}
}
