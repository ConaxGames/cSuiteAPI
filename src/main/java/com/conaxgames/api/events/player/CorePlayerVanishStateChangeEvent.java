package com.conaxgames.api.events.player;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import lombok.Getter;

@Getter
public class CorePlayerVanishStateChangeEvent extends CoreEvent {

    private final ICorePlayer corePlayer;
    private final boolean isVanished;
    private final long timestamp;

    public CorePlayerVanishStateChangeEvent(ICorePlayer corePlayer, boolean isVanished) {
        this.corePlayer = corePlayer;
        this.isVanished = isVanished;
        this.timestamp = System.currentTimeMillis();
    }
}
