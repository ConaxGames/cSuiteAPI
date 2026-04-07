package com.conaxgames.api.managers;

import com.conaxgames.api.ICorePlayer;
import org.bukkit.inventory.InventoryView;

public interface IContainerProvider {

    InventoryView openAnvil(ICorePlayer corePlayer);

    InventoryView openCartographyTable(ICorePlayer corePlayer);

    InventoryView openGrindstone(ICorePlayer corePlayer);

    InventoryView openLoom(ICorePlayer corePlayer);

    InventoryView openSmithingTable(ICorePlayer corePlayer);

    InventoryView openStonecutter(ICorePlayer corePlayer);

}
