package malicedev.tribute;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.texture.stitcher.AtlasStitcher;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.event.defs.ClientEvents;
import turniplabs.halplibe.helper.TextureHelper;
import turniplabs.halplibe.util.dependency.Key;


import static malicedev.tribute.Main.MOD_ID;

	public class ModClient implements ClientModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);







		@Override
		public void onInitializeClient() {
			ClientEvents.BLOCK_MODEL_RELOAD.listen(Key.of(MOD_ID),(t)->new ModModels().initBlockModels(t));
			ClientEvents.ITEM_MODEL_RELOAD.listen(Key.of(MOD_ID),(t)->new ModModels().initItemModels(t));
			ClientEvents.ENTITY_RENDERER_RELOAD.listen(Key.of(MOD_ID),(t)->new ModModels().initEntityModels(t));
		}

	}
