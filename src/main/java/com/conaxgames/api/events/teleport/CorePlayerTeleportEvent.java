package com.conaxgames.api.events.teleport;

import com.conaxgames.api.events.CoreCancellableEvent;
import com.conaxgames.api.objects.TeleportType;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class CorePlayerTeleportEvent extends CoreCancellableEvent {
    private static final HandlerList handlers = new HandlerList();

    private final TeleportType tpType;
    private final Player player;
    private final Location location;

    private boolean cancelled;

    public CorePlayerTeleportEvent(TeleportType teleportType, Player player, Location location) {
        this.tpType = teleportType;
        this.player = player;
        this.location = location;
    }

    public Player getPlayer() {
        return this.player;
    }

    public Location getLocation() {
        return this.location;
    }

    public TeleportType getTeleportType() {
        return this.tpType;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}