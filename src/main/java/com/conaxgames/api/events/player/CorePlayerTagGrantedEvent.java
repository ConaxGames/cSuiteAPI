package com.conaxgames.api.events.player;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IChatTag;
import lombok.Getter;

@Getter
public class CorePlayerTagGrantedEvent extends CoreCancellableEvent {

    private final ICorePlayer corePlayer;
    private final IChatTag tag;
    private final long timestamp;

    public CorePlayerTagGrantedEvent(ICorePlayer corePlayer, IChatTag tag) {
        this.corePlayer = corePlayer;
        this.tag = tag;
        this.timestamp = System.currentTimeMillis();
    }
}
