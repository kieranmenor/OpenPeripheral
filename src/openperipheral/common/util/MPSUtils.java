package openperipheral.common.util;

import net.machinemuse.utils.MuseItemUtils;
import net.minecraft.item.ItemStack;

public class MPSUtils {
	public static boolean isValidHelmet(ItemStack stack) {
		return MuseItemUtils.itemHasActiveModule(stack, "Terminal Glasses Module");
	}

}
