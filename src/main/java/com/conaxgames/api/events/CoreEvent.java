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
    private static final Plugin corePlugin = Bukkit.getPluginManager().getPlugin("cSuite");

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public boolean call() {
        // Check for plugin existence only once at class level
        if (corePlugin == null) {
            throw new IllegalStateException("Core plugin (cSuite) not found. Event cannot be called.");
        }

        // force sync event calling as of 21/06/22
        if (Bukkit.isPrimaryThread()) {
            // Run synchronously if on the main thread
            Bukkit.getServer().getPluginManager().callEvent(this);
        } else {
            // Run asynchronously if not on the main thread
            Bukkit.getScheduler().runTask(corePlugin, () -> Bukkit.getPluginManager().callEvent(this));
        }

        // If the event is cancellable, return whether it was cancelled
        return this instanceof Cancellable && ((Cancellable) this).isCancelled();
    }
}
