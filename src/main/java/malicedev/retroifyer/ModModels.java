package malicedev.retroifyer;

import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

public class ModModels implements ModelEntrypoint {

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {
			dispatcher.addDispatch(new BlockModelRotatable<>(ModBlocks.Retroifyer)
				.setTex(0, "minecraft:block/leaves/oak_retro", Side.NORTH)
				.setTex(0, "minecraft:block/brick_clay_retro", Side.SOUTH)
				.setTex(0, "retroifyer:block/retroifyer/retroifyer_side", Side.BOTTOM)
				.setTex(0, "retroifyer:block/retroifyer/retroifyer_side", Side.EAST)
				.setTex(0, "retroifyer:block/retroifyer/retroifyer_front", Side.TOP)
				.setTex(0, "retroifyer:block/retroifyer/retroifyer_side", Side.WEST)
			);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Bricks_BlockRetro)
			.setTex(0, "minecraft:block/brick_clay_retro", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelCactus<>(ModBlocks.Cactus_BlockRetro)
			.setTex(0, "minecraft:block/cactus/top_retro", Side.TOP)
			.setTex(0, "minecraft:block/cactus/bottom_retro", Side.BOTTOM)
			.setTex(0, "minecraft:block/cactus/side_retro", Side.NORTH)
			.setTex(0, "minecraft:block/cactus/side_retro", Side.WEST)
			.setTex(0, "minecraft:block/cactus/side_retro", Side.EAST)
			.setTex(0, "minecraft:block/cactus/side_retro", Side.SOUTH)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Cobble_BlockRetro)
			.setTex(0, "minecraft:block/cobbled_stone_retro", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.CobbleMossy_BlockRetro)
			.setTex(0, "minecraft:block/cobbled_stone_mossy_retro", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Diamond_BlockRetro)
			.setTex(0, "minecraft:block/block_diamond/top_retro", Side.TOP)
			.setTex(0, "minecraft:block/block_diamond/bottom_retro", Side.BOTTOM)
			.setTex(0, "minecraft:block/block_diamond/side_retro", Side.NORTH)
			.setTex(0, "minecraft:block/block_diamond/side_retro", Side.WEST)
			.setTex(0, "minecraft:block/block_diamond/side_retro", Side.EAST)
			.setTex(0, "minecraft:block/block_diamond/side_retro", Side.SOUTH)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Gold_BlockRetro)
			.setTex(0, "minecraft:block/block_gold/top_retro", Side.TOP)
			.setTex(0, "minecraft:block/block_gold/bottom_retro", Side.BOTTOM)
			.setTex(0, "minecraft:block/block_gold/side_retro", Side.NORTH)
			.setTex(0, "minecraft:block/block_gold/side_retro", Side.WEST)
			.setTex(0, "minecraft:block/block_gold/side_retro", Side.EAST)
			.setTex(0, "minecraft:block/block_gold/side_retro", Side.SOUTH)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Iron_BlockRetro)
			.setTex(0, "minecraft:block/block_iron/top_retro", Side.TOP)
			.setTex(0, "minecraft:block/block_iron/bottom_retro", Side.BOTTOM)
			.setTex(0, "minecraft:block/block_iron/side_retro", Side.NORTH)
			.setTex(0, "minecraft:block/block_iron/side_retro", Side.WEST)
			.setTex(0, "minecraft:block/block_iron/side_retro", Side.EAST)
			.setTex(0, "minecraft:block/block_iron/side_retro", Side.SOUTH)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.OreCoal_BlockRetro)
			.setTex(0, "minecraft:block/ore/coal/stone_retro", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.OreIron_BlockRetro)
			.setTex(0, "minecraft:block/ore/iron/stone_retro", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.OreRedstone_BlockRetro)
			.setTex(0, "minecraft:block/ore/redstone/stone_retro", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.OreGold_BlockRetro)
			.setTex(0, "minecraft:block/ore/gold/stone_retro", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.OreDiamond_BlockRetro)
			.setTex(0, "minecraft:block/ore/diamond/stone_retro", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Cobble_BlockAncient)
			.setTex(0, "retroifyer:block/ancient/ancient_cobble", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Planks_BlockAncient)
			.setTex(0, "retroifyer:block/ancient/ancient_planks", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Grass_BlockAncient)
			.setTex(0, "retroifyer:block/ancient/ancient_grass", Side.sides)
		);

	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}
}
