package com.conaxgames.api.events.permissions;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import lombok.Getter;

@Getter
public class CorePermissionRemoveEvent extends CoreEvent {

    private final ICorePlayer target;
    private final String permission;
    private final String scope;

    public CorePermissionRemoveEvent(ICorePlayer target, String permission, String scope) {
        this.target = target;
        this.permission = permission;
        this.scope = scope;
    }

}
