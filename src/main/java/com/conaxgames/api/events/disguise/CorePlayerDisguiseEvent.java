package com.conaxgames.api.events.disguise;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.interfaces.IRank;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class CorePlayerDisguiseEvent extends CoreEvent implements Cancellable {

    private final ICorePlayer corePlayer;
    private final IRank disguiseRank;
    private final String disguiseName;
    private final String disguiseSkin;
    private final long timestamp = System.currentTimeMillis();

    public CorePlayerDisguiseEvent(ICorePlayer corePlayer, IRank disguiseRank, String disguiseName, String disguiseSkin) {
        this.corePlayer = corePlayer;
        this.disguiseRank = disguiseRank;
        this.disguiseName = disguiseName;
        this.disguiseSkin = disguiseSkin;
    }

    private boolean cancelled;

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }
}
