package com.conaxgames.api.events;

import com.conaxgames.CorePluginAPI;
import org.bukkit.Bukkit;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.Plugin;

public abstract class CoreEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    protected CoreEvent() {
    }

    /**
     * @param async true for an event that runs on the thread firing it instead of the main thread
     */
    protected CoreEvent(boolean async) {
        super(async);
    }

    /**
     * Fires the event and returns whether it was cancelled. Async events run where they are fired, any other event
     * fired off the main thread is handed to it.
     */
    public boolean call() {
        if (!CorePluginAPI.isRegistered()) {
            throw new IllegalStateException("CorePluginAPI is not registered. Event cannot be called.");
        }
        if (this.isAsynchronous() || Bukkit.isPrimaryThread()) {
            Bukkit.getPluginManager().callEvent(this);
        } else {
            Plugin bukkitPlugin = CorePluginAPI.getPlugin().getPlugin();
            CorePluginAPI.getScheduler().runTask(bukkitPlugin, () -> Bukkit.getPluginManager().callEvent(this));
        }
        return this instanceof Cancellable cancellable && cancellable.isCancelled();
    }
}
