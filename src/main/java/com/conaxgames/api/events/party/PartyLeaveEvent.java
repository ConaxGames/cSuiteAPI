package com.conaxgames.api.events.party;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IParty;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class PartyLeaveEvent extends CoreEvent implements Cancellable {

    private final IParty party;
    private final ICorePlayer member;
    private final boolean wasLeader;
    private final long timestamp;

    private boolean cancelled;

    public PartyLeaveEvent(IParty party, ICorePlayer member, boolean wasLeader, long timestamp) {
        this.party = party;
        this.member = member;
        this.wasLeader = wasLeader;
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
