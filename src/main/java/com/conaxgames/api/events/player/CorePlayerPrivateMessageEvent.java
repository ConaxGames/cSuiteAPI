package com.conaxgames.api.events.player;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import lombok.Getter;

@Getter
public class CorePlayerPrivateMessageEvent extends CoreCancellableEvent {

    private final ICorePlayer from;
    private final ICorePlayer to;

    public CorePlayerPrivateMessageEvent(ICorePlayer from, ICorePlayer to) {
        this.from = from;
        this.to = to;
    }
}
