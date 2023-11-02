package com.conaxgames.api.events.player;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import com.conaxgames.api.interfaces.IChatTag;
import com.conaxgames.api.interfaces.IChatTagColor;
import lombok.Getter;

@Getter
public class CorePlayerTagColorGrantedEvent extends CoreCancellableEvent {

    private final ICorePlayer corePlayer;
    private final IChatTagColor tagColor;
    private final long timestamp;

    public CorePlayerTagColorGrantedEvent(ICorePlayer corePlayer, IChatTagColor tagColor) {
        this.corePlayer = corePlayer;
        this.tagColor = tagColor;
        this.timestamp = System.currentTimeMillis();
    }
}
