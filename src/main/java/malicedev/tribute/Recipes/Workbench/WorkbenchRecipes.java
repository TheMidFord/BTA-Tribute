package malicedev.tribute.Recipes.Workbench;
import malicedev.tribute.ModBlocks;
import malicedev.tribute.ModItems;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.item.ItemBucket;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.util.helper.DyeColor;
import turniplabs.halplibe.helper.RecipeBuilder;

import static malicedev.tribute.Main.MOD_ID;

public class WorkbenchRecipes {
	private WorkbenchRecipes(){}

	public static void init(){
		RecipeBuilder.Shaped(MOD_ID, "RBR", "GJG", "RWR")
			.addInput('B', Blocks.PERMAFROST)
			.addInput('G', Items.DUST_GLOWSTONE)
			.addInput('R', Items.DUST_REDSTONE)
			.addInput('J', Items.JAR)
			.addInput('W', ItemBucket.createRecipeInput(Items.BUCKET_IRON,ItemBucket.STATE_WATER))
			.create("hourglassnormal", new ItemStack(ModItems.HourglassNormal, 8));

		RecipeBuilder.Shaped(MOD_ID, "RBR", "GJG", "RWR")
			.addInput('B', Blocks.SLATE)
			.addInput('G', Items.DUST_GLOWSTONE)
			.addInput('R', Items.DUST_REDSTONE)
			.addInput('J', Items.JAR)
			.addInput('W', ItemBucket.createRecipeInput(Items.BUCKET_IRON,ItemBucket.STATE_WATER))
			.create("hourglassretro", new ItemStack(ModItems.HourglassRetro, 8));

		RecipeBuilder.Shaped(MOD_ID, "RBR", "GJG", "RWR")
			.addInput('B', Blocks.NETHERRACK)
			.addInput('G', Items.DUST_GLOWSTONE)
			.addInput('R', Items.DUST_REDSTONE)
			.addInput('J', Items.JAR)
			.addInput('W', ItemBucket.createRecipeInput(Items.BUCKET_IRON,ItemBucket.STATE_WATER))
			.create("hourglassancient", new ItemStack(ModItems.HourglassAncient, 8));

		RecipeBuilder.Shaped(MOD_ID, "CC", "CC")
			.addInput('C', ModBlocks.Cobble_BlockRetro)
			.create("stonecutter_retrocobble", new ItemStack(ModBlocks.StoneCutter, 1));

		RecipeBuilder.Shaped(MOD_ID, "CC", "CC")
			.addInput('C', ModBlocks.Cobble_BlockAncient)
			.create("stonecutter_ancientcobble", new ItemStack(ModBlocks.StoneCutter, 1));

		RecipeBuilder.Shaped(MOD_ID, "CC", "CC")
			.addInput('C', Blocks.COBBLE_STONE)
			.create("stonecutter_moderncobble", new ItemStack(ModBlocks.StoneCutter, 1));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ItemBucket.createRecipeInput(Items.BUCKET_IRON,ItemBucket.STATE_WATER))
			.addInput(ModItems.HourglassAncient)
			.create("classicwater", new ItemStack(ModBlocks.Water_Ancient, 4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ItemBucket.createRecipeInput(Items.BUCKET_IRON,ItemBucket.STATE_LAVA))
			.addInput(ModItems.HourglassAncient)
			.create("classiclava", new ItemStack(ModBlocks.Lava_Ancient, 4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ItemBucket.createRecipeInput(Items.BUCKET_IRON,ItemBucket.STATE_WATER))
			.addInput(ItemBucket.createRecipeInput(Items.BUCKET_IRON,ItemBucket.STATE_WATER))
			.addInput(Blocks.OBSIDIAN)
			.addInput(Blocks.OBSIDIAN)
			.create("cryingobsidian", new ItemStack(ModBlocks.Crying_Obsidian, 8));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Items.NETHERCOAL)
			.addInput(Items.NETHERCOAL)
			.addInput(Blocks.OBSIDIAN)
			.addInput(Blocks.OBSIDIAN)
			.create("glowingobsidian", new ItemStack(ModBlocks.Glowing_Obsidian, 8));

		RecipeBuilder.Shaped(MOD_ID, "IDI", "IDI", "IDI")
			.addInput('D', Items.DIAMOND)
			.addInput('I', Items.INGOT_IRON)
			.create("netherreactorcore", new ItemStack(ModBlocks.Reactor_Core, 8));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ModBlocks.Reactor_Core)
			.create("netherreactorcoreactive", new ItemStack(ModBlocks.Reactor_Core_Active, 1));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ModBlocks.Reactor_Core_Active)
			.create("netherreactorcorespent", new ItemStack(ModBlocks.Reactor_Core_Spent, 1));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ModBlocks.Reactor_Core_Spent)
			.create("netherreactorcore_recycle", new ItemStack(ModBlocks.Reactor_Core, 1));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Blocks.FLOWER_RED)
			.addInput(Items.DYE, DyeColor.LIGHT_BLUE.itemMeta)
			.create("bluerose", new ItemStack(ModBlocks.Blue_Rose, 1));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ModBlocks.Lime_Cloth)
			.addInput(ModBlocks.Lime_Cloth)
			.addInput(Items.DYE, DyeColor.GREEN.itemMeta)
			.addInput(Items.DYE, DyeColor.GREEN.itemMeta)
			.create("sourapplecloth", new ItemStack(ModBlocks.SourApple_Cloth, 4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ModBlocks.SourApple_Cloth)
			.addInput(ModBlocks.SourApple_Cloth)
			.addInput(Items.DYE, DyeColor.LIGHT_BLUE.itemMeta)
			.addInput(Items.DYE, DyeColor.LIGHT_BLUE.itemMeta)
			.create("mintcloth", new ItemStack(ModBlocks.Mint_Cloth, 4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ModBlocks.Mint_Cloth)
			.addInput(ModBlocks.Mint_Cloth)
			.addInput(Items.DYE, DyeColor.LIGHT_BLUE.itemMeta)
			.addInput(Items.DYE, DyeColor.LIGHT_BLUE.itemMeta)
			.create("turquoisecloth", new ItemStack(ModBlocks.Turquoise_Cloth, 4));


		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ModBlocks.Violet_Cloth)
			.addInput(ModBlocks.Violet_Cloth)
			.addInput(Items.DYE, DyeColor.SILVER.itemMeta)
			.addInput(Items.DYE, DyeColor.SILVER.itemMeta)
			.create("lavendercloth", new ItemStack(ModBlocks.Lavender_Cloth, 4));


	}

}
