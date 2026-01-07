package com.conaxgames.api.events.player;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import lombok.Getter;

@Getter
public class CorePlayerLiveStartEvent extends CoreCancellableEvent {

    private final ICorePlayer corePlayer;
    private final String platform;
    private final long timestamp;

    public CorePlayerLiveStartEvent(ICorePlayer corePlayer, String platform) {
        this.corePlayer = corePlayer;
        this.platform = platform;
        this.timestamp = System.currentTimeMillis();
    }
}
