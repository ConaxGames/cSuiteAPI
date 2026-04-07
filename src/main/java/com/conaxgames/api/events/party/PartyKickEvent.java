package com.conaxgames.api.events.party;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IParty;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class PartyKickEvent extends CoreEvent implements Cancellable {

    private final IParty party;
    private final ICorePlayer kicker;
    private final ICorePlayer kicked;
    private final long timestamp;

    private boolean cancelled;

    public PartyKickEvent(IParty party, ICorePlayer kicker, ICorePlayer kicked, long timestamp) {
        this.party = party;
        this.kicker = kicker;
        this.kicked = kicked;
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
