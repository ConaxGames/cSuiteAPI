package com.conaxgames.api.events.player;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import lombok.Getter;

@Getter
public class CorePlayerLiveStopEvent extends CoreEvent {

    private final ICorePlayer corePlayer;
    private final String platform;
    private final long timestamp;

    public CorePlayerLiveStopEvent(ICorePlayer corePlayer, String platform) {
        this.corePlayer = corePlayer;
        this.platform = platform;
        this.timestamp = System.currentTimeMillis();
    }
}
