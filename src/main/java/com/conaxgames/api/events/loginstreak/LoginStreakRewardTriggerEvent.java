package com.conaxgames.api.events.loginstreak;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class LoginStreakRewardTriggerEvent extends CoreEvent implements Cancellable {

    private final ICorePlayer target;

    private boolean cancelled;

    public LoginStreakRewardTriggerEvent(ICorePlayer target) {
        this.target = target;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }
}
