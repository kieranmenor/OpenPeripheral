package openperipheral.core.interfaces;

import net.minecraft.inventory.IInventory;

public interface IInventoryCallback {
	public void onInventoryChanged(IInventory inventory, int slotNumber);
}
