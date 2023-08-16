package com.conaxgames.api.events.player;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import lombok.Getter;

@Getter
public class CorePlayerReportEvent extends CoreEvent {

    public CorePlayerReportEvent(ICorePlayer corePlayer) {
    }
}
