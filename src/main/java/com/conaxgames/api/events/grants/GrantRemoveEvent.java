package com.conaxgames.api.events.grants;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.interfaces.IGrant;
import lombok.Getter;

@Getter
public class GrantRemoveEvent extends CoreEvent {

    private final ICorePlayer target;
    private final IGrant grant;

    public GrantRemoveEvent(ICorePlayer target, IGrant grant) {
        this.target = target;
        this.grant = grant;
    }

}
