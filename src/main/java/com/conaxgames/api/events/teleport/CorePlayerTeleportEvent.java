package com.conaxgames.api.events.teleport;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import com.conaxgames.api.objects.TeleportType;
import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.event.HandlerList;

@Getter
public final class CorePlayerTeleportEvent extends CoreCancellableEvent {

    private static final HandlerList handlers = new HandlerList();

    private final TeleportType teleportType;
    private final ICorePlayer corePlayer;
    private final Location location;

    public CorePlayerTeleportEvent(TeleportType teleportType, ICorePlayer corePlayer, Location location) {
        this.teleportType = teleportType;
        this.corePlayer = corePlayer;
        this.location = location;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
