package com.conaxgames.api.events.loginstreak;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import lombok.Getter;

@Getter
public class LoginStreakResetEvent extends CoreEvent {

    private final ICorePlayer target;
    private final int newStreak;

    public LoginStreakResetEvent(ICorePlayer target, int newStreak) {
        this.target = target;
        this.newStreak = newStreak;
    }
}
