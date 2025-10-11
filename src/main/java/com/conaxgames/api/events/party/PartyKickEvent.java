package com.conaxgames.api.events.party;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IParty;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

@Getter
public class PartyKickEvent extends CoreEvent implements Cancellable {

    private final IParty party;
    private final Player kicker;
    private final Player kicked;
    private final long timestamp;

    public PartyKickEvent(IParty party, Player kicker, Player kicked, long timestamp) {
        this.party = party;
        this.kicker = kicker;
        this.kicked = kicked;
        this.timestamp = timestamp;
    }

    private boolean cancelled;

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }
}
