package malicedev.retroifyer;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.util.collection.NamespaceID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.EntityHelper;
import turniplabs.halplibe.helper.network.NetworkHandler;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

import java.util.Properties;

public class Main implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint {
	public static final String MOD_ID = "tribute";
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
		LOGGER.info("Tribute initialized.");
		}

	@Override
	public void onRecipesReady() {}

	@Override
	public void initNamespaces() {}

	@Override
	public void beforeGameStart() {
		ModBlocks.init();
		ModItems.init();
	}

	@Override
	public void afterGameStart() {
		TheTagIterator.init();
	}
}
