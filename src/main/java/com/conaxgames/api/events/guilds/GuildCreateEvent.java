package com.conaxgames.api.events.guilds;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

@Getter
public class GuildCreateEvent extends CoreEvent implements Cancellable {

    private final IGuild guild;
    private final Player leader;
    private final long timestamp;

    public GuildCreateEvent(IGuild guild, Player leader, long timestamp) {
        this.guild = guild;
        this.leader = leader;
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
