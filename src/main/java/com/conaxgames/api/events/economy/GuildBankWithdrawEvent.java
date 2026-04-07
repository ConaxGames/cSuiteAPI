package com.conaxgames.api.events.economy;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
public class GuildBankWithdrawEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final IGuild guild;
    private final ICorePlayer corePlayer;
    private final double amount;
    private final boolean successful;
    private boolean cancelled;

    public GuildBankWithdrawEvent(IGuild guild, ICorePlayer corePlayer, double amount, boolean successful) {
        this.guild = guild;
        this.corePlayer = corePlayer;
        this.amount = amount;
        this.successful = successful;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
