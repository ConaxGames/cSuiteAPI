package com.conaxgames.api.managers;

import org.bukkit.Location;

public interface ITeleportManager {

    ITeleportProvider getTeleportProvider();

    Location getSpawn();

}
