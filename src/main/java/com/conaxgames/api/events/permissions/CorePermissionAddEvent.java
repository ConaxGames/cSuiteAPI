package com.conaxgames.api.events.permissions;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import lombok.Getter;

@Getter
public class CorePermissionAddEvent extends CoreEvent {

    private final ICorePlayer target;
    private final String permission;
    private final String scope;
    private final String duration;
    private final long expiry;

    public CorePermissionAddEvent(ICorePlayer target, String permission, String scope, String duration, long expiry) {
        this.target = target;
        this.permission = permission;
        this.scope = scope;
        this.duration = duration;
        this.expiry = expiry;
    }

}
