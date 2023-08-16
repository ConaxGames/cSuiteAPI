package com.conaxgames.api.interfaces.managers;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.player.PlayerTeleportEvent;

import java.util.concurrent.CompletableFuture;

public interface ITeleportProvider {

    CompletableFuture<Boolean> teleport(Entity entity, Location location);

    CompletableFuture<Boolean> teleport(Entity entity, Location location, PlayerTeleportEvent.TeleportCause teleportCause);
}
