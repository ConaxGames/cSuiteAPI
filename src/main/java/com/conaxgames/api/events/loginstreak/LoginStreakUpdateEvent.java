package com.conaxgames.api.events.loginstreak;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import lombok.Getter;

@Getter
public class LoginStreakUpdateEvent extends CoreEvent{

    private final ICorePlayer target;
    private final int newStreak;

    public LoginStreakUpdateEvent(ICorePlayer target, int newStreak) {
        this.target = target;
        this.newStreak = newStreak;
    }
}
