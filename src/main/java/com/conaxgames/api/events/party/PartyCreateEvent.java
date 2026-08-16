package com.conaxgames.api.events.party;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IParty;
import lombok.Getter;

@Getter
public class PartyCreateEvent extends CoreEvent {

    private final IParty party;
    private final ICorePlayer leader;
    private final long timestamp = System.currentTimeMillis();

    public PartyCreateEvent(IParty party, ICorePlayer leader) {
        this.party = party;
        this.leader = leader;
    }
}
