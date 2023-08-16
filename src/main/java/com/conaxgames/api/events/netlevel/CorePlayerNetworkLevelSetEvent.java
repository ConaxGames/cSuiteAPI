package com.conaxgames.api.events.netlevel;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import lombok.Getter;

@Getter
public class CorePlayerNetworkLevelSetEvent extends CoreEvent {

    private final ICorePlayer corePlayer;
    private int level;

    public CorePlayerNetworkLevelSetEvent(ICorePlayer corePlayer, int level) {
        this.corePlayer = corePlayer;
        this.level = level;
    }
}
