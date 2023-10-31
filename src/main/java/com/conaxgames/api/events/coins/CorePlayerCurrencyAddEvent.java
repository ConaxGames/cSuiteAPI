package com.conaxgames.api.events.coins;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class CorePlayerCurrencyAddEvent extends CoreEvent implements Cancellable {

    private final ICorePlayer corePlayer;
    private final String currency;
    private int amount;
    private double multiplier;
    private final String reason;

    private boolean cancelled;

    public CorePlayerCurrencyAddEvent(ICorePlayer corePlayer, String currency, int amount, double multiplier, String reason) {
        this.corePlayer = corePlayer;
        this.currency = currency;
        this.amount = amount;
        this.multiplier = multiplier;
        this.reason = reason;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }
}
