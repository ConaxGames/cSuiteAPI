package com.conaxgames.api.events.party;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IParty;
import lombok.Getter;

@Getter
public class PartyJoinEvent extends CoreEvent {

    private final IParty party;
    private final ICorePlayer member;
    private final long timestamp = System.currentTimeMillis();

    public PartyJoinEvent(IParty party, ICorePlayer member) {
        this.party = party;
        this.member = member;
    }
}
