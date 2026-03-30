package malicedev.tribute;

import malicedev.tribute.Tags.ModBlockTags;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.tag.BlockTags;

public class TheTagIterator {
	public static void init(){

		for (
			Block<?> b : Blocks.blockMap.values()) {
			if (b.hasTag(BlockTags.GROWS_CACTI) && b != Blocks.CACTUS) {
				b.withTags(ModBlockTags.GROWS_CACTI_RETRO);
			}
		}
	}
}
