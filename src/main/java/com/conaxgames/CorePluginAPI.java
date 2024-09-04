package com.conaxgames;

import com.conaxgames.api.ICorePlugin;
import lombok.Getter;

@Getter
public final class CorePluginAPI {

    private static ICorePlugin plugin;

    public static CorePluginAPI instance;

    public CorePluginAPI(ICorePlugin corePlugin) {
        instance = this;
        plugin = corePlugin;
    }

    @SuppressWarnings("unused")
    public static ICorePlugin getPlugin() {
        return plugin;
    }

    public static void sendDebug(String action, String info) {
        plugin.sendCritical(action, info);
    }

    public static boolean isRegistered() {
        return instance != null;
    }
}
