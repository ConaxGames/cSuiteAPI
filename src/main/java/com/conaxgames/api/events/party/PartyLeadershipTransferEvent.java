package com.conaxgames.api.events.party;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IParty;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class PartyLeadershipTransferEvent extends CoreEvent implements Cancellable {

    private final IParty party;
    private final ICorePlayer oldLeader;
    private final ICorePlayer newLeader;
    private final long timestamp;

    private boolean cancelled;

    public PartyLeadershipTransferEvent(IParty party, ICorePlayer oldLeader, ICorePlayer newLeader, long timestamp) {
        this.party = party;
        this.oldLeader = oldLeader;
        this.newLeader = newLeader;
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
