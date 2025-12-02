package com.conaxgames;

import com.conaxgames.api.ICorePlugin;
import com.conaxgames.api.interfaces.managers.IPartyManager;
import com.conaxgames.libraries.util.scheduler.Scheduler;
import lombok.Getter;

/**
 * The {@code CorePluginAPI} class provides static access to the core plugin instance
 * and utility methods for interacting with it.
 *
 * <p>This class also includes methods to send debug information and check if the
 * core plugin has been registered.</p>
 *
 * <p>It is designed to work as a singleton, where only one instance of the {@code CorePluginAPI}
 * can exist at any time.</p>
 */
@Getter
public final class CorePluginAPI {

    /**
     * The instance of the core plugin used by this API.
     */
    private static ICorePlugin plugin;

    /**
     * The singleton instance of the {@code CorePluginAPI}.
     */
    public static CorePluginAPI instance;

    /**
     * Constructs a new {@code CorePluginAPI} with the specified {@code ICorePlugin}.
     *
     * @param corePlugin the core plugin instance to be set.
     */
    public CorePluginAPI(ICorePlugin corePlugin) {
        instance = this;
        plugin = corePlugin;
    }

    /**
     * Returns the core plugin instance associated with this API.
     *
     * @return the {@code ICorePlugin} instance.
     */
    @SuppressWarnings("unused")
    public static ICorePlugin getPlugin() {
        return plugin;
    }

    /**
     * Sends a debug message with the specified action and information.
     *
     * @param action the action being debugged.
     * @param info additional information related to the action.
     */
    public static void sendDebug(String action, String info) {
        plugin.sendCritical(action, info);
    }

    /**
     * Checks if the {@code CorePluginAPI} has been registered.
     *
     * @return {@code true} if the API is registered, {@code false} otherwise.
     */
    public static boolean isRegistered() {
        return instance != null;
    }

    /**
     * Gets the unified scheduler that works across both Bukkit and Folia servers.
     * This scheduler automatically detects the server type and uses the appropriate implementation.
     *
     * @return the unified {@code Scheduler} instance
     * @throws IllegalStateException if the CorePluginAPI is not registered
     */
    public static Scheduler getScheduler() {
        if (!isRegistered()) {
            throw new IllegalStateException("CorePluginAPI is not registered. Cannot access scheduler.");
        }
        return plugin.getLibrary().getScheduler();
    }
    // test
    /**
     * Gets the party manager for managing parties and party-related operations.
     *
     * @return the {@code IPartyManager} instance
     * @throws IllegalStateException if the CorePluginAPI is not registered
     */
    public static IPartyManager getPartyManager() {
        if (!isRegistered()) {
            throw new IllegalStateException("CorePluginAPI is not registered. Cannot access party manager.");
        }
        return plugin.getPartyManager();
    }
}
