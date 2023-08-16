package com.conaxgames.api.events.guilds;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class GuildRetagEvent extends CoreEvent implements Cancellable {

    private final IGuild guild;
    private final ICorePlayer leader;
    private final String newGuildTag;
    private final long timestamp;

    private boolean cancelled;

    public GuildRetagEvent(IGuild guild, ICorePlayer leader, String newGuildTag, long timestamp) {
        this.guild = guild;
        this.leader = leader;
        this.newGuildTag = newGuildTag ;
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
