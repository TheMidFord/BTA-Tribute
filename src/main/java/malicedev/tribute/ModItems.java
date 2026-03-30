package malicedev.tribute;

import malicedev.tribute.HourglassRetro.AncientHourglassItem;
import malicedev.tribute.HourglassRetro.HourglassItem;
import malicedev.tribute.HourglassRetro.NormalHourglassItem;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.ItemBuilder;

public class ModItems {
	private ModItems(){}
	public static Item HourglassRetro;
	public static Item HourglassAncient;
	public static Item HourglassNormal;

	public static void init() {
		HourglassRetro = new ItemBuilder(Main.MOD_ID)
			.build(new HourglassItem("retro_hourglass", "tribute:item/hourglass_retro", Main.itemId++));
		HourglassAncient = new ItemBuilder(Main.MOD_ID)
			.build(new AncientHourglassItem("ancient_hourglass", "tribute:item/hourglass_ancient", Main.itemId++));
		HourglassNormal = new ItemBuilder(Main.MOD_ID)
			.build(new NormalHourglassItem("normal_hourglass", "tribute:item/hourglass_normal", Main.itemId++));
	}

}
