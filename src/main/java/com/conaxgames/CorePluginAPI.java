package com.conaxgames;

import com.conaxgames.api.ICorePlugin;
import com.conaxgames.api.managers.IPartyManager;
import com.conaxgames.libraries.util.scheduler.Scheduler;
import lombok.Getter;

@Getter
public final class CorePluginAPI {

    private static ICorePlugin plugin;

    public static CorePluginAPI instance;

    public CorePluginAPI(ICorePlugin corePlugin) {
        instance = this;
        plugin = corePlugin;
    }

    public static ICorePlugin getPlugin() {
        return plugin;
    }

    public static void sendDebug(String action, String info) {
        plugin.sendCritical(action, info);
    }

    public static boolean isRegistered() {
        return instance != null;
    }

    public static Scheduler getScheduler() {
        if (!isRegistered()) {
            throw new IllegalStateException("CorePluginAPI is not registered. Cannot access scheduler.");
        }
        return plugin.getLibrary().getScheduler();
    }

    public static IPartyManager getPartyManager() {
        if (!isRegistered()) {
            throw new IllegalStateException("CorePluginAPI is not registered. Cannot access party manager.");
        }
        return plugin.getPartyManager();
    }
}
