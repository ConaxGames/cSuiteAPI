package com.conaxgames.api.events.disguise;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class CorePlayerUndisguiseEvent extends CoreEvent implements Cancellable {

    private final ICorePlayer corePlayer;
    private final long timestamp = System.currentTimeMillis();

    public CorePlayerUndisguiseEvent(ICorePlayer corePlayer) {
        this.corePlayer = corePlayer;
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
