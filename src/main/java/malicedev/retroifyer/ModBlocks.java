package malicedev.retroifyer;

import malicedev.retroifyer.BlockLogic.BlockLogicRetroifyer;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.tag.ItemTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.ItemBuilder;

import static malicedev.retroifyer.Main.blockId;
import static malicedev.retroifyer.Main.itemId;

public class ModBlocks {
	private ModBlocks() {}
	public static Block Retroifyer;
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
		Retroifyer = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.FIRE)
			.setHardness(2)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("retroifyer","retroifyer", blockId++,(block) ->new BlockLogicRetroifyer(block, false));

	Diamond_BlockRetro = new BlockBuilder(Main.MOD_ID)
		.setBlockSound(BlockSounds.STONE)
			.setHardness(2)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_retrodiamond","block_retrodiamond", blockId++,(block) ->new BlockLogic(block, Material.stone));

		Gold_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.METAL)
			.setHardness(2)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_retrogold","block_retrogold", blockId++,(block) ->new BlockLogic(block, Material.metal));
		Iron_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.METAL)
			.setHardness(2)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_retroiron","block_retroiron", blockId++,(block) ->new BlockLogic(block, Material.metal));
		Bricks_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(2)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_retrobrick","block_retrobrick", blockId++,(block) ->new BlockLogic(block, Material.stone));
		Cobble_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(2)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_retrocobble","block_retrocobble", blockId++,(block) ->new BlockLogicCobble(block, Material.stone, Blocks.GRAVEL.blockItemSupplier));
		CobbleMossy_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(2)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("block_retromossycobble","block_retromossycobble", blockId++,(block) ->new BlockLogicCobble(block, Material.stone, Blocks.GRAVEL.blockItemSupplier));
		Cactus_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setHardness(0.6F)
			.setBlockSound(BlockSounds.CLOTH)
			.build("block_retrocactus","block_retrocactus", blockId++,(block) ->new BlockLogicCactus(block));
		OreCoal_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(2)
			.build("block_retrocoalore","block_retrocoalore", blockId++,(block) ->new BlockLogic(block,Material.stone));
		OreIron_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(2)
			.build("block_retroironore","block_retroironore", blockId++,(block) ->new BlockLogic(block,Material.stone));
		OreRedstone_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(2)
			.build("block_retroredstoneore","block_retroredstoneore", blockId++,(block) ->new BlockLogic(block,Material.stone));
		OreGold_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(2)
			.build("block_retrogoldore","block_retrogoldore", blockId++,(block) ->new BlockLogic(block,Material.stone));
		OreDiamond_BlockRetro = new BlockBuilder(Main.MOD_ID)
			.setHardness(2)
			.setBlockSound(BlockSounds.STONE)
			.build("block_retrodiamondore","block_retrodiamondore", blockId++,(block) ->new BlockLogic(block,Material.stone));
		Planks_BlockAncient = new BlockBuilder(Main.MOD_ID)
			.setBlockSound(BlockSounds.WOOD)
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.setHardness(2)
			.build("block_ancientplanks","block_ancientplanks", blockId++,(block) ->new BlockLogic(block,Material.wood));
		Grass_BlockAncient = new BlockBuilder(Main.MOD_ID)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL)
			.setHardness(2)
			.setBlockSound(BlockSounds.GRASS)
			.build("block_ancientgrass","block_ancientgrass", blockId++,(block) ->new BlockLogic(block,Material.grass));
		Cobble_BlockAncient = new BlockBuilder(Main.MOD_ID)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setHardness(2)
			.setBlockSound(BlockSounds.STONE)
			.build("block_ancientcobble","block_ancientcobble", blockId++,(block) ->new BlockLogicCobble(block,Material.stone,Blocks.GRAVEL.blockItemSupplier));







	}
}
