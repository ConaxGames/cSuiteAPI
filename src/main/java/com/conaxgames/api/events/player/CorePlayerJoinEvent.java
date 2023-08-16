package com.conaxgames.api.events.player;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import lombok.Getter;

@Getter
public class CorePlayerJoinEvent extends CoreEvent {

    private final ICorePlayer corePlayer;
    private final long timestamp;

    public CorePlayerJoinEvent(ICorePlayer corePlayer) {
        this.corePlayer = corePlayer;
        this.timestamp = System.currentTimeMillis();
    }
}
