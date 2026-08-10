package malicedev.tribute;

import malicedev.tribute.HourglassRetro.ProjectileHourglassAncient;
import malicedev.tribute.HourglassRetro.ProjectileHourglassNormal;
import malicedev.tribute.HourglassRetro.ProjectileHourglassRetro;
import net.minecraft.client.render.EntityRendererDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.block.model.generic.BlockModelGeneric;
import net.minecraft.client.render.block.model.generic.BlockModelGenericFurnace;
import net.minecraft.client.render.entity.EntityRendererSprite;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.util.helper.Side;
import org.useless.dragonfly.data.block.mojang.BlockModelMojangData;

import static net.minecraft.client.render.block.model.BlockModelDispatcher.loadDataModel;


public class ModModels {

	public void initBlockModels(BlockModelDispatcher dispatcher) {
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Bricks_BlockRetro)
			.setTex("minecraft:block/brick_clay_retro", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelGeneric<>(ModBlocks.Cactus_BlockRetro,loadDataModel("tribute:block/cactus_retro"))

//			.setTex("minecraft:block/cactus/top_retro", Side.TOP)
//			.setTex("minecraft:block/cactus/bottom_retro", Side.BOTTOM)
//			.setTex("minecraft:block/cactus/side_retro", Side.NORTH)
//			.setTex("minecraft:block/cactus/side_retro", Side.WEST)
//			.setTex("minecraft:block/cactus/side_retro", Side.EAST)
//			.setTex("minecraft:block/cactus/side_retro", Side.SOUTH)
		);


		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Cobble_BlockRetro)
			.setTex("minecraft:block/cobbled_stone_retro", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.CobbleMossy_BlockRetro)
			.setTex("minecraft:block/cobbled_stone_mossy_retro", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Diamond_BlockRetro)
			.setTex("tribute:block/vanillabtarestored/block_diamond/top_retro", Side.TOP)
			.setTex("tribute:block/vanillabtarestored/block_diamond/bottom_retro", Side.BOTTOM)
			.setTex("tribute:block/vanillabtarestored/block_diamond/side_retro", Side.NORTH)
			.setTex("tribute:block/vanillabtarestored/block_diamond/side_retro", Side.WEST)
			.setTex("tribute:block/vanillabtarestored/block_diamond/side_retro", Side.EAST)
			.setTex("tribute:block/vanillabtarestored/block_diamond/side_retro", Side.SOUTH)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Gold_BlockRetro)
			.setTex("tribute:block/vanillabtarestored/block_gold/top_retro", Side.TOP)
			.setTex("tribute:block/vanillabtarestored/block_gold/bottom_retro", Side.BOTTOM)
			.setTex("tribute:block/vanillabtarestored/block_gold/side_retro", Side.NORTH)
			.setTex("tribute:block/vanillabtarestored/block_gold/side_retro", Side.WEST)
			.setTex("tribute:block/vanillabtarestored/block_gold/side_retro", Side.EAST)
			.setTex("tribute:block/vanillabtarestored/block_gold/side_retro", Side.SOUTH)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Iron_BlockRetro)
			.setTex("tribute:block/vanillabtarestored/block_iron/top_retro", Side.TOP)
			.setTex("tribute:block/vanillabtarestored/block_iron/bottom_retro", Side.BOTTOM)
			.setTex("tribute:block/vanillabtarestored/block_iron/side_retro", Side.NORTH)
			.setTex("tribute:block/vanillabtarestored/block_iron/side_retro", Side.WEST)
			.setTex("tribute:block/vanillabtarestored/block_iron/side_retro", Side.EAST)
			.setTex("tribute:block/vanillabtarestored/block_iron/side_retro", Side.SOUTH)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.OreCoal_BlockRetro)
			.setTex("minecraft:block/ore/coal/stone_retro", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.OreIron_BlockRetro)
			.setTex("minecraft:block/ore/iron/stone_retro", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.OreRedstone_BlockRetro)
			.setTex("minecraft:block/ore/redstone/stone_retro", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.OreGold_BlockRetro)
			.setTex("minecraft:block/ore/gold/stone_retro", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.OreDiamond_BlockRetro)
			.setTex("minecraft:block/ore/diamond/stone_retro", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Cobble_BlockAncient)
			.setTex("tribute:block/ancient/ancient_cobble", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Planks_BlockAncient)
			.setTex("tribute:block/ancient/ancient_planks", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Grass_BlockAncient)
			.setTex("tribute:block/ancient/ancient_grass", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Brick_Ancient)
			.setTex("tribute:block/ancient/bricks", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Water_Ancient)
			.onRenderLayer(1)
			.setTex("tribute:block/ancient/water", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Lava_Ancient)
			.onRenderLayer(1)
			.setTex("tribute:block/ancient/lava", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Crying_Obsidian)
			.onRenderLayer(1)
			.setTex("tribute:block/ancient/crying_obsidian", Side.sides)
		);

		//Cloth.
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Cotton_Cloth)
			.setTex("tribute:block/ancient/cotton", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Overcast_Cloth)
			.setTex("tribute:block/ancient/overcast", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Thundercloud_Cloth)
			.setTex("tribute:block/ancient/thundercloud", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Crimson_Cloth)
			.setTex("tribute:block/ancient/crimson", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Tangerine_Cloth)
			.setTex("tribute:block/ancient/tangerine", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Banana_Cloth)
			.setTex("tribute:block/ancient/banana", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Lime_Cloth)
			.setTex("tribute:block/ancient/lime", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.SourApple_Cloth)
			.setTex("tribute:block/ancient/sour_apple", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Mint_Cloth)
			.setTex("tribute:block/ancient/mint", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Turquoise_Cloth)
			.setTex("tribute:block/ancient/turquoise", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Azure_Cloth)
			.setTex("tribute:block/ancient/azure", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Indigo_Cloth)
			.setTex("tribute:block/ancient/indigo", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Violet_Cloth)
			.setTex("tribute:block/ancient/violet", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Lavender_Cloth)
			.setTex("tribute:block/ancient/lavender", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Magenta_Cloth)
			.setTex("tribute:block/ancient/magenta", Side.sides)
		);
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Rose_Cloth)
			.setTex("tribute:block/ancient/rose", Side.sides)
		);
		//End Cloth.//
		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Glowing_Obsidian)
			.setTex("tribute:block/pocket/glowing_obsidian", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Reactor_Core)
			.setTex("tribute:block/pocket/reactor_core", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelHorizontalRotation<>(ModBlocks.Reactor_Core_Active)
			.setTex("tribute:block/pocket/reactor_core_active", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelStandard<>(ModBlocks.Reactor_Core_Spent)
			.setTex("tribute:block/pocket/reactor_core_spent", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelCrossedSquares<>(ModBlocks.Blue_Rose)
			.setTex("tribute:block/pocket/blue_rose", Side.sides)
		);

		dispatcher.addDispatch(new BlockModelRotatable<>(ModBlocks.StoneCutter)
			.setTex("minecraft:block/furnace_stone/side", Side.sides)
			.setTex("tribute:block/pocket/stonecutter_top", Side.NORTH)
			.setTex("minecraft:block/furnace_stone/bottom",Side.SOUTH)
			.setTex("tribute:block/pocket/stonecutter_front",Side.TOP)
		);

	}


	public void initItemModels(ItemModelDispatcher dispatcher) {
		dispatcher.addDispatch(new ItemModelStandard(ModItems.HourglassRetro, null).setIcon("tribute:item/hourglass_retro"));
		dispatcher.addDispatch(new ItemModelStandard(ModItems.HourglassAncient, null).setIcon("tribute:item/hourglass_ancient"));
		dispatcher.addDispatch(new ItemModelStandard(ModItems.HourglassNormal, null).setIcon("tribute:item/hourglass_normal"));
	}


	public void initEntityModels(EntityRendererDispatcher dispatcher) {
		dispatcher.assignRenderer(ProjectileHourglassRetro.class, new EntityRendererSprite<>(ModItems.HourglassRetro));
		dispatcher.assignRenderer(ProjectileHourglassAncient.class,new EntityRendererSprite<>(ModItems.HourglassAncient));
		dispatcher.assignRenderer(ProjectileHourglassNormal.class,new EntityRendererSprite<>(ModItems.HourglassNormal));

	}


	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {
	}


	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}
}
