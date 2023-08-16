package com.conaxgames.api.events.player;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.interfaces.IPunishment;
import lombok.Getter;

@Getter
public class CorePlayerUnpunishEvent extends CoreEvent {

    private final ICorePlayer corePlayer;
    private final IPunishment punishment;
    private final Long currentSystemLong;

    public CorePlayerUnpunishEvent(ICorePlayer corePlayer, IPunishment punishment) {
        this.corePlayer = corePlayer;
        this.punishment = punishment;
        this.currentSystemLong = System.currentTimeMillis();
    }
}
