package com.conaxgames.api.events.player;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import lombok.Getter;

@Getter
public class CorePlayerPermissionRefreshEvent extends CoreEvent {

    private final ICorePlayer corePlayer;
    private final String reason;
    private final Long currentSystemLong;

    public CorePlayerPermissionRefreshEvent(ICorePlayer corePlayer, String reason) {
        this.corePlayer = corePlayer;
        this.reason = reason;
        this.currentSystemLong = System.currentTimeMillis();
    }
}
