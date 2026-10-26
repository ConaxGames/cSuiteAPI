package com.conaxgames.api.events.coins;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import lombok.Getter;

@Getter
public class CorePlayerCurrencyAddEvent extends CoreCancellableEvent {

    private final ICorePlayer corePlayer;
    private final String currency;
    private final String reason;
    private int amount;
    private double multiplier;

    public CorePlayerCurrencyAddEvent(ICorePlayer corePlayer, String currency, int amount, double multiplier, String reason) {
        this.corePlayer = corePlayer;
        this.currency = currency;
        this.amount = amount;
        this.multiplier = multiplier;
        this.reason = reason;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }
}
