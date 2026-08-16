package com.conaxgames.api.events.party;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IParty;
import lombok.Getter;

@Getter
public class PartyLeaveEvent extends CoreEvent {

    private final IParty party;
    private final ICorePlayer member;
    private final boolean wasLeader;
    private final long timestamp = System.currentTimeMillis();

    public PartyLeaveEvent(IParty party, ICorePlayer member, boolean wasLeader) {
        this.party = party;
        this.member = member;
        this.wasLeader = wasLeader;
    }
}
