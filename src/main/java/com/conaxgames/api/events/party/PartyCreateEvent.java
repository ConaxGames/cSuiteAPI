package com.conaxgames.api.events.party;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IParty;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

@Getter
public class PartyCreateEvent extends CoreEvent implements Cancellable {

    private final IParty party;
    private final Player leader;
    private final long timestamp;

    public PartyCreateEvent(IParty party, Player leader, long timestamp) {
        this.party = party;
        this.leader = leader;
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
