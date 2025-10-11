package com.conaxgames.api.events.party;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IParty;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

@Getter
public class PartyLeadershipTransferEvent extends CoreEvent implements Cancellable {

    private final IParty party;
    private final Player oldLeader;
    private final Player newLeader;
    private final long timestamp;

    public PartyLeadershipTransferEvent(IParty party, Player oldLeader, Player newLeader, long timestamp) {
        this.party = party;
        this.oldLeader = oldLeader;
        this.newLeader = newLeader;
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
