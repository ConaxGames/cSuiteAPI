package com.conaxgames.api.events.party;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IParty;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

@Getter
public class PartyDisbandEvent extends CoreEvent implements Cancellable {

    private final IParty party;
    private final Player disbander;
    private final long timestamp;

    public PartyDisbandEvent(IParty party, Player disbander, long timestamp) {
        this.party = party;
        this.disbander = disbander;
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
