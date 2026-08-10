package malicedev.tribute.BlockLogic;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;
import net.minecraft.core.world.pos.TilePosc;

import java.util.ArrayList;

public class BlockLogicFluidClassic extends BlockLogic {
	public BlockLogicFluidClassic(Block<?> block, Material material) {
		super(block, material);

	}

	@Override
	public boolean collidesWithEntity(Entity entity, World world, TilePosc tilePosc) {
		return false;
	}

	@Override
	public boolean isSolidRender() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlockOnCondition(WorldSource world, int x, int y, int z) {
		return false;
	}
}
