package com.conaxgames.api.events.party;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IParty;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

@Getter
public class PartyInviteEvent extends CoreEvent implements Cancellable {

    private final IParty party;
    private final Player inviter;
    private final Player target;
    private final long timestamp;

    public PartyInviteEvent(IParty party, Player inviter, Player target, long timestamp) {
        this.party = party;
        this.inviter = inviter;
        this.target = target;
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
