package com.conaxgames.api.events.chat;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import lombok.Getter;

@Getter
public class GlobalChatMessageEvent extends CoreEvent {

    private final ICorePlayer corePlayer;
    private final String message;
    private final long timestamp;

    public GlobalChatMessageEvent(ICorePlayer corePlayer, String message) {
        this.corePlayer = corePlayer;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }
}
