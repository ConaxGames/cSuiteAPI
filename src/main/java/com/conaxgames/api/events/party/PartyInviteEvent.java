package com.conaxgames.api.events.party;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IParty;
import lombok.Getter;

@Getter
public class PartyInviteEvent extends CoreEvent {

    private final IParty party;
    private final ICorePlayer inviter;
    private final ICorePlayer target;
    private final long timestamp = System.currentTimeMillis();

    public PartyInviteEvent(IParty party, ICorePlayer inviter, ICorePlayer target) {
        this.party = party;
        this.inviter = inviter;
        this.target = target;
    }
}
