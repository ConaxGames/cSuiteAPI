package com.conaxgames.api.interfaces.managers;

import org.bukkit.entity.Player;
import org.bukkit.inventory.InventoryView;

public interface IContainerProvider {

    InventoryView openAnvil(Player player);

    InventoryView openCartographyTable(Player player);

    InventoryView openGrindstone(Player player);

    InventoryView openLoom(Player player);

    InventoryView openSmithingTable(Player player);

    InventoryView openStonecutter(Player player);

}
