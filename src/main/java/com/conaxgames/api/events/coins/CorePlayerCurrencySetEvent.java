package com.conaxgames.api.events.coins;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class CorePlayerCurrencySetEvent extends CoreEvent implements Cancellable {

    private final ICorePlayer corePlayer;
    private final String currency;
    private int amount;
    private final String reason;

    private boolean cancelled;

    public CorePlayerCurrencySetEvent(ICorePlayer corePlayer, String currency, int amount, String reason) {
        this.corePlayer = corePlayer;
        this.currency = currency;
        this.amount = amount;
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
}
