package com.conaxgames.api.events.player;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import lombok.Getter;

@Getter
public class CorePlayerStaffModeSwitchEvent extends CoreEvent {

    private final ICorePlayer corePlayer;
    private final boolean staffMode;
    private final long timestamp;

    public CorePlayerStaffModeSwitchEvent(ICorePlayer corePlayer, boolean staffMode) {
        this.corePlayer = corePlayer;
        this.staffMode = staffMode;
        this.timestamp = System.currentTimeMillis();
    }
}
