package malicedev.retroifyer;

import malicedev.retroifyer.BlockLogic.BlockLogicCactusRetro;
import malicedev.retroifyer.Tags.ModBlockTags;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;

import static malicedev.retroifyer.Main.blockId;

public class ModBlocks {
	private ModBlocks() {}
	public static Block Diamond_BlockRetro;
	public static Block Gold_BlockRetro;
	public static Block Iron_BlockRetro;
	public static Block Bricks_BlockRetro;
	public static Block Cobble_BlockRetro;
	public static Block CobbleMossy_BlockRetro;
	public static Block Cactus_BlockRetro;
	public static Block OreCoal_BlockRetro;
	public static Block OreIron_BlockRetro;
	public static Block OreRedstone_BlockRetro;
	public static Block OreDiamond_BlockRetro;
	public static Block OreGold_BlockRetro;
	public static Block Planks_BlockAncient;
	public static Block Grass_BlockAncient;
	public static Block Cobble_BlockAncient;



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







	}
}
