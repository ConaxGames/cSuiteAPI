package com.conaxgames.api.events.player;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import lombok.Getter;

@Getter
public class CorePlayerReportEvent extends CoreEvent {

    private final ICorePlayer corePlayer;

    public CorePlayerReportEvent(ICorePlayer corePlayer) {
        this.corePlayer = corePlayer;
    }
}
