package malicedev.tribute;

import malicedev.tribute.HourglassRetro.ProjectileHourglassAncient;
import malicedev.tribute.HourglassRetro.ProjectileHourglassNormal;
import malicedev.tribute.HourglassRetro.ProjectileHourglassRetro;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.entity.EntityRendererSprite;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static turniplabs.halplibe.helper.ModelHelper.itemModelDispatcher;

public class ModModels implements ModelEntrypoint {

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {
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
			.setTex(0, "tribute:block/ancient/ancient_cobble", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Planks_BlockAncient)
			.setTex(0, "tribute:block/ancient/ancient_planks", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Grass_BlockAncient)
			.setTex(0, "tribute:block/ancient/ancient_grass", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Brick_Ancient)
			.setTex(0, "tribute:block/ancient/bricks", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Water_Ancient)
			.onRenderLayer(1)
			.setTex(0, "tribute:block/ancient/water", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Lava_Ancient)
			.onRenderLayer(1)
			.setTex(0, "tribute:block/ancient/lava", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Crying_Obsidian)
			.onRenderLayer(1)
			.setTex(0, "tribute:block/ancient/crying_obsidian", Side.sides)
		);

		//Cloth.
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Cotton_Cloth)
			.setTex(0, "tribute:block/ancient/cotton", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Overcast_Cloth)
			.setTex(0, "tribute:block/ancient/overcast", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Thundercloud_Cloth)
			.setTex(0, "tribute:block/ancient/thundercloud", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Crimson_Cloth)
			.setTex(0, "tribute:block/ancient/crimson", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Tangerine_Cloth)
			.setTex(0, "tribute:block/ancient/tangerine", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Banana_Cloth)
			.setTex(0, "tribute:block/ancient/banana", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Lime_Cloth)
			.setTex(0, "tribute:block/ancient/lime", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.SourApple_Cloth)
			.setTex(0, "tribute:block/ancient/sour_apple", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Mint_Cloth)
			.setTex(0, "tribute:block/ancient/mint", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Turquoise_Cloth)
			.setTex(0, "tribute:block/ancient/turquoise", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Azure_Cloth)
			.setTex(0, "tribute:block/ancient/azure", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Indigo_Cloth)
			.setTex(0, "tribute:block/ancient/indigo", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Violet_Cloth)
			.setTex(0, "tribute:block/ancient/violet", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Lavender_Cloth)
			.setTex(0, "tribute:block/ancient/lavender", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Magenta_Cloth)
			.setTex(0, "tribute:block/ancient/magenta", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Rose_Cloth)
			.setTex(0, "tribute:block/ancient/rose", Side.sides)
		);
		//End Cloth.//
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Glowing_Obsidian)
			.setTex(0, "tribute:block/pocket/glowing_obsidian", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Reactor_Core)
			.setTex(0, "tribute:block/pocket/reactor_core", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelHorizontalRotation<>(ModBlocks.Reactor_Core_Active)
			.setTex(0, "tribute:block/pocket/reactor_core_active", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Reactor_Core_Spent)
			.setTex(0, "tribute:block/pocket/reactor_core_spent", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelCrossedSquares<>(ModBlocks.Blue_Rose)
			.setTex(0, "tribute:block/pocket/blue_rose", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelFurnace(ModBlocks.StoneCutter)
			.setTex(0, "tribute:block/pocket/stonecutter_top", Side.TOP)
			.setTex(0, "minecraft:block/furnace_stone/bottom",Side.BOTTOM)
			.setTex(0, "tribute:block/pocket/stonecutter_front",Side.NORTH)
			.setTex(0, "minecraft:block/furnace_stone/side", Side.WEST, Side.EAST, Side.SOUTH));

	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
		itemModelDispatcher.addDispatch(new ItemModelStandard(ModItems.HourglassRetro, null).setIcon("tribute:item/hourglass_retro"));
		itemModelDispatcher.addDispatch(new ItemModelStandard(ModItems.HourglassAncient, null).setIcon("tribute:item/hourglass_ancient"));
		itemModelDispatcher.addDispatch(new ItemModelStandard(ModItems.HourglassNormal, null).setIcon("tribute:item/hourglass_normal"));
	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {
		ModelHelper.setEntityModel(ProjectileHourglassRetro.class, () -> new EntityRendererSprite<>(ModItems.HourglassRetro));
		ModelHelper.setEntityModel(ProjectileHourglassAncient.class, () -> new EntityRendererSprite<>(ModItems.HourglassAncient));
		ModelHelper.setEntityModel(ProjectileHourglassNormal.class, () -> new EntityRendererSprite<>(ModItems.HourglassNormal));

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {
	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}
}
