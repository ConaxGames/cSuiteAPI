package com.conaxgames.api.events.party;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IParty;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class PartyInviteEvent extends CoreEvent implements Cancellable {

    private final IParty party;
    private final ICorePlayer inviter;
    private final ICorePlayer target;
    private final long timestamp;

    private boolean cancelled;

    public PartyInviteEvent(IParty party, ICorePlayer inviter, ICorePlayer target, long timestamp) {
        this.party = party;
        this.inviter = inviter;
        this.target = target;
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
