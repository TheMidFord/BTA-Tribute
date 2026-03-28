package malicedev.retroifyer;

import malicedev.retroifyer.HourglassRetro.HourglassItem;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.ItemBuilder;

public class ModItems {
	private ModItems(){}
	public static Item HourglassRetro;

	public static void init() {
		HourglassRetro = new ItemBuilder(Main.MOD_ID)
			.build(new HourglassItem("retro_hourglass", "retroifyer:item/hourglass", Main.itemId++));
	}
}
