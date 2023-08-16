package com.conaxgames.api.events.player;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import lombok.Getter;

@Getter
public class CorePlayerAsyncPreLoginEvent extends CoreEvent {

    private final ICorePlayer corePlayer;
    private final long timestamp;

    public CorePlayerAsyncPreLoginEvent(ICorePlayer corePlayer) {
        this.corePlayer = corePlayer;
        this.timestamp = System.currentTimeMillis();
    }
}
