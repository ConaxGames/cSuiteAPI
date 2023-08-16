package com.conaxgames.api.events;

import org.bukkit.Bukkit;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.Plugin;

/**
 * Base event for all CorePlugin API event calls.
 */
public abstract class CoreEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public boolean call() {
        // force sync event calling as of 21/06/22
        Plugin corePlugin = Bukkit.getPluginManager().getPlugin("cSuite");
        if (corePlugin != null) {
            Bukkit.getScheduler().runTask(corePlugin, () -> Bukkit.getServer().getPluginManager().callEvent(this));
        }
        return this instanceof Cancellable && ((Cancellable) this).isCancelled();
    }
}
