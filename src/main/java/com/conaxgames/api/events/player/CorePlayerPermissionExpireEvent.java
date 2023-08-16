package com.conaxgames.api.events.player;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import lombok.Getter;

@Getter
public class CorePlayerPermissionExpireEvent extends CoreEvent {

    private final ICorePlayer corePlayer;
    private final String permission;
    private final String scope;
    private final Long expiry;
    private final Long currentSystemLong;

    public CorePlayerPermissionExpireEvent(ICorePlayer corePlayer, String permission, String scope, Long expiry) {
        this.corePlayer = corePlayer;
        this.permission = permission;
        this.scope = scope;
        this.expiry = expiry;
        this.currentSystemLong = System.currentTimeMillis();
    }
}
