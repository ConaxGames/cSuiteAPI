package com.conaxgames.api.events.party;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IParty;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

@Getter
public class PartyJoinEvent extends CoreEvent implements Cancellable {

    private final IParty party;
    private final Player player;
    private final long timestamp;

    public PartyJoinEvent(IParty party, Player player, long timestamp) {
        this.party = party;
        this.player = player;
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
