package com.conaxgames.api.events.party;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IParty;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

@Getter
public class PartyLeaveEvent extends CoreEvent implements Cancellable {

    private final IParty party;
    private final Player player;
    private final boolean wasLeader;
    private final long timestamp;

    public PartyLeaveEvent(IParty party, Player player, boolean wasLeader, long timestamp) {
        this.party = party;
        this.player = player;
        this.wasLeader = wasLeader;
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
