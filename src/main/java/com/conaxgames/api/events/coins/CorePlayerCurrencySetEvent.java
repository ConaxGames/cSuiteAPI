package com.conaxgames.api.events.coins;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import lombok.Getter;

@Getter
public class CorePlayerCurrencySetEvent extends CoreCancellableEvent {

    private final ICorePlayer corePlayer;
    private final String currency;
    private final String reason;
    private int amount;

    public CorePlayerCurrencySetEvent(ICorePlayer corePlayer, String currency, int amount, String reason) {
        this.corePlayer = corePlayer;
        this.currency = currency;
        this.amount = amount;
        this.reason = reason;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
