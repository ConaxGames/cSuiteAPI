package com.conaxgames.api.events.party;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IParty;
import lombok.Getter;

@Getter
public class PartyDisbandEvent extends CoreEvent {

    private final IParty party;
    private final ICorePlayer disbander;
    private final long timestamp = System.currentTimeMillis();

    public PartyDisbandEvent(IParty party, ICorePlayer disbander) {
        this.party = party;
        this.disbander = disbander;
    }
}
