package com.conaxgames.api.events.party;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IParty;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class PartyCreateEvent extends CoreEvent implements Cancellable {

    private final IParty party;
    private final ICorePlayer leader;
    private final long timestamp;

    private boolean cancelled;

    public PartyCreateEvent(IParty party, ICorePlayer leader, long timestamp) {
        this.party = party;
        this.leader = leader;
        this.timestamp = timestamp;
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
