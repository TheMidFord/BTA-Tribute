package malicedev.tribute;

import malicedev.tribute.Recipes.Workbench.WorkbenchRecipes;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.HalpLibe;
import turniplabs.halplibe.event.defs.CommonEvents;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.dependency.Key;

import java.util.Properties;

public class Main implements ModInitializer {
	public static final String MOD_ID = HalpLibe.registerMod("tribute", true);
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
		public static int itemId;
		public static int blockId;
		static {
			Properties prop = new Properties();
			prop.setProperty("starting_block_id","9100");
			prop.setProperty("starting_item_id","30000");
			ConfigHandler config = new ConfigHandler(MOD_ID,prop);

			blockId = config.getInt("starting_block_id");
			itemId = config.getInt("starting_item_id");

			config.updateConfig();
		}
	@Override
	public void onInitialize() {
		CommonEvents.BEFORE_GAME_START.listen(Key.of(MOD_ID), this::beforeGameStart);
		CommonEvents.RECIPES_READY.listen(Key.of(MOD_ID),this::onRecipesReady);
		CommonEvents.RECIPES_NAMESPACE_INIT.listen(Key.of(MOD_ID),this::initNamespaces);
		CommonEvents.AFTER_GAME_START.listen(Key.of(MOD_ID),this::afterGameStart);
		LOGGER.info("Tribute initialized.");

		}

	public void onRecipesReady() {
		WorkbenchRecipes.init();
	}


	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}


	public void beforeGameStart() {
		ModBlocks.init();
		ModItems.init();
	}


	public void afterGameStart() {
		TheTagIterator.init();
	}
}
