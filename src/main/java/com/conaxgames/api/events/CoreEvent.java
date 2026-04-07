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

    public boolean call() {
        if (!CorePluginAPI.isRegistered()) {
            throw new IllegalStateException("CorePluginAPI is not registered. Event cannot be called.");
        }
        Plugin bukkitPlugin = CorePluginAPI.getPlugin().getPlugin();
        if (Bukkit.isPrimaryThread()) {
            Bukkit.getServer().getPluginManager().callEvent(this);
        } else {
            CorePluginAPI.getScheduler().runTask(bukkitPlugin, () -> Bukkit.getPluginManager().callEvent(this));
        }
        return this instanceof Cancellable && ((Cancellable) this).isCancelled();
    }
}
