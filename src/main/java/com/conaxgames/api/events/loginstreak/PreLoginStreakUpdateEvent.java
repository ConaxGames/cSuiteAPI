package com.conaxgames.api.events.loginstreak;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import lombok.Getter;

@Getter
public class PreLoginStreakUpdateEvent extends CoreCancellableEvent {

    private final ICorePlayer target;

    public PreLoginStreakUpdateEvent(ICorePlayer target) {
        this.target = target;
    }
}
