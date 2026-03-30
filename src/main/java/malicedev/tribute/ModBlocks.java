package malicedev.tribute;

import malicedev.tribute.BlockLogic.BlockLogicCactusRetro;
import malicedev.tribute.BlockLogic.BlockLogicFluidClassic;
import malicedev.tribute.BlockLogic.BlockLogicRotatableAbstractBypass;
import malicedev.tribute.Tags.ModBlockTags;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;

import static malicedev.tribute.Main.blockId;

public class ModBlocks {
	private ModBlocks() {}
	public static Block<?> Diamond_BlockRetro;
	public static Block<?> Gold_BlockRetro;
	public static Block<?> Iron_BlockRetro;
	public static Block<?> Bricks_BlockRetro;
	public static Block<?> Cobble_BlockRetro;
	public static Block<?> CobbleMossy_BlockRetro;
	public static Block<?> Cactus_BlockRetro;
	public static Block<?> OreCoal_BlockRetro;
	public static Block<?> OreIron_BlockRetro;
	public static Block<?> OreRedstone_BlockRetro;
	public static Block<?> OreDiamond_BlockRetro;
	public static Block<?> OreGold_BlockRetro;
	public static Block<?> Planks_BlockAncient;
	public static Block<?> Grass_BlockAncient;
	public static Block<?> Cobble_BlockAncient;
	public static Block<?> Brick_Ancient;
	public static Block<?> Water_Ancient;
	public static Block<?> Lava_Ancient;
	public static Block<?> Crying_Obsidian;
	//Cloths. Sixteen of them.//
	public static Block<?> Cotton_Cloth;
	public static Block<?> Overcast_Cloth;
	public static Block<?> Thundercloud_Cloth;
	public static Block<?> Crimson_Cloth;
	public static Block<?> Tangerine_Cloth;
	public static Block<?> Banana_Cloth;
	public static Block<?> Lime_Cloth;
	public static Block<?> SourApple_Cloth;
	public static Block<?> Mint_Cloth;
	public static Block<?> Turquoise_Cloth;
	public static Block<?> Azure_Cloth;
	public static Block<?> Indigo_Cloth;
	public static Block<?> Violet_Cloth;
	public static Block<?> Lavender_Cloth;
	public static Block<?> Magenta_Cloth;
	public static Block<?> Rose_Cloth;
	//End Cloths.//
	public static Block<?> Glowing_Obsidian;
	public static Block<?> Blue_Rose;
	public static Block<?> Reactor_Core;
	public static Block<?> Reactor_Core_Active;
	public static Block<?> Reactor_Core_Spent;
	public static Block<?> StoneCutter;

	public static void init() {

	Diamond_BlockRetro = new BlockBuilder(Main.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
			.setHardness(1.5f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_retrodiamond","block_retrodiamond", blockId++,(block) ->new BlockLogic(block, Material.stone));

		Gold_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.METAL)
			.setHardness(1.5f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_retrogold","block_retrogold", blockId++,(block) ->new BlockLogic(block, Material.metal));
		Iron_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.METAL)
			.setHardness(1.5f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_retroiron","block_retroiron", blockId++,(block) ->new BlockLogic(block, Material.metal));
		Bricks_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.5f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_retrobrick","block_retrobrick", blockId++,(block) ->new BlockLogic(block, Material.stone));
		Cobble_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.5f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_retrocobble","block_retrocobble", blockId++,(block) ->new BlockLogicCobble(block, Material.stone, Blocks.GRAVEL.blockItemSupplier));
		CobbleMossy_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.5f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_retromossycobble","block_retromossycobble", blockId++,(block) ->new BlockLogicCobble(block, Material.stone, Blocks.GRAVEL.blockItemSupplier));
		Cactus_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setHardness(0.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(ModBlockTags.GROWS_CACTI_RETRO)
			.build("block_retrocactus","block_retrocactus", blockId++,(block) ->new BlockLogicCactusRetro(block));
		OreCoal_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(3f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_retrocoalore","block_retrocoalore", blockId++,(block) ->new BlockLogic(block,Material.stone));
		OreIron_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(3f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_retroironore","block_retroironore", blockId++,(block) ->new BlockLogic(block,Material.stone));
		OreRedstone_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(3f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_retroredstoneore","block_retroredstoneore", blockId++,(block) ->new BlockLogic(block,Material.stone));
		OreGold_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(3f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_retrogoldore","block_retrogoldore", blockId++,(block) ->new BlockLogic(block,Material.stone));
		OreDiamond_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setHardness(3f)
			.setBlockSound(BlockSounds.STONE)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_retrodiamondore","block_retrodiamondore", blockId++,(block) ->new BlockLogic(block,Material.stone));
		//ANCIENT BLOCKS
		Planks_BlockAncient = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.WOOD)
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setHardness(1.5f)
			.build("block_ancientplanks","block_ancientplanks", blockId++,(block) ->new BlockLogic(block,Material.wood));
		Grass_BlockAncient = new BlockBuilder(Main.MOD_ID)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setHardness(0.5f)
			.setBlockSound(BlockSounds.GRASS)
			.build("block_ancientgrass","block_ancientgrass", blockId++,(block) ->new BlockLogic(block,Material.grass));
		Cobble_BlockAncient = new BlockBuilder(Main.MOD_ID)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.STONE)
			.build("block_ancientcobble","block_ancientcobble", blockId++,(block) ->new BlockLogicCobble(block,Material.stone,Blocks.GRAVEL.blockItemSupplier));
		Brick_Ancient = new BlockBuilder(Main.MOD_ID)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.STONE)
			.build("block_ancientbrick","block_ancientbrick", blockId++,(block) ->new BlockLogic(block,Material.stone));
		Water_Ancient = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.setBlockSound(BlockSounds.CLOTH)
			.build("block_ancientwater","block_ancientwater", blockId++,(block) ->new BlockLogicFluidClassic(block,Material.water));
		Lava_Ancient = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.build("block_ancientlava","block_ancientlava", blockId++,(block) ->new BlockLogicFluidClassic(block,Material.lava));
		Crying_Obsidian = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.STONE)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_cryingobsidian","block_cryingobsidian", blockId++,(block) ->new BlockLogic(block,Material.stone));

		//Cloths.//
		Cotton_Cloth = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.build("block_cottoncloth","block_cottoncloth", blockId++,(block) ->new BlockLogic(block, Material.cloth));

		Overcast_Cloth = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.build("block_overcastcloth","block_overcastcloth", blockId++,(block) ->new BlockLogic(block, Material.cloth));

		Thundercloud_Cloth = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.build("block_thundercloudcloth","block_thundercloudcloth", blockId++,(block) ->new BlockLogic(block, Material.cloth));

		Crimson_Cloth = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.build("block_crimsoncloth","block_crimsoncloth", blockId++,(block) ->new BlockLogic(block, Material.cloth));

		Tangerine_Cloth = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.build("block_tangerinecloth","block_tangerinecloth", blockId++,(block) ->new BlockLogic(block, Material.cloth));

		Banana_Cloth = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.build("block_bananacloth","block_bananacloth", blockId++,(block) ->new BlockLogic(block, Material.cloth));

		Lime_Cloth = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.build("block_limecloth","block_limecloth", blockId++,(block) ->new BlockLogic(block, Material.cloth));

		SourApple_Cloth = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.build("block_sourapplecloth","block_sourapplecloth", blockId++,(block) ->new BlockLogic(block, Material.cloth));

		Mint_Cloth = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.build("block_mintcloth","block_mintcloth", blockId++,(block) ->new BlockLogic(block, Material.cloth));

		Turquoise_Cloth = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.build("block_turquoisecloth","block_turquoisecloth", blockId++,(block) ->new BlockLogic(block, Material.cloth));

		Azure_Cloth = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.build("block_azurecloth","block_azurecloth", blockId++,(block) ->new BlockLogic(block, Material.cloth));

		Indigo_Cloth = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.build("block_indigocloth","block_indigocloth", blockId++,(block) ->new BlockLogic(block, Material.cloth));

		Violet_Cloth = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.build("block_violetcloth","block_violetcloth", blockId++,(block) ->new BlockLogic(block, Material.cloth));

		Lavender_Cloth = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.build("block_lavendercloth","block_lavendercloth", blockId++,(block) ->new BlockLogic(block, Material.cloth));

		Magenta_Cloth = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.build("block_magentacloth","block_magentacloth", blockId++,(block) ->new BlockLogic(block, Material.cloth));

		Rose_Cloth = new BlockBuilder(Main.MOD_ID)
			.setHardness(1.5f)
			.setBlockSound(BlockSounds.CLOTH)
			.setTags(BlockTags.MINEABLE_BY_SHEARS)
			.build("block_rosecloth","block_rosecloth", blockId++,(block) ->new BlockLogic(block, Material.cloth));
		//End Cloth.//

		Glowing_Obsidian = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.5f)
			.setLuminance(6)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_glowingobsidian","block_glowingobsidian", blockId++,(block) ->new BlockLogic(block, Material.stone));

		Reactor_Core = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.5f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_reactorcore","block_reactorcore", blockId++,(block) ->new BlockLogic(block, Material.stone));

		Reactor_Core_Active = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.5f)
			.setLuminance(6)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_reactorcore_active","block_reactorcore_active", blockId++,(block) ->new BlockLogic(block, Material.stone));

		Reactor_Core_Spent = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.5f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_reactorcore_spent","block_reactorcore_spent", blockId++,(block) ->new BlockLogic(block, Material.stone));

		StoneCutter = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.5f)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_stonecutter","block_stonecutter", blockId++,(block) ->new BlockLogicRotatableAbstractBypass(block, Material.stone));

		Blue_Rose = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(0f)
			.setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR, BlockTags.SHEEPS_FAVOURITE_BLOCK, BlockTags.SHEARS_DO_SILK_TOUCH)
			.build("blue_rose","blue_rose", blockId++,(block) ->new BlockLogicFlowerStackable(block));







	}
}
