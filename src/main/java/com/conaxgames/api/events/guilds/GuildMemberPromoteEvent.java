package com.conaxgames.api.events.guilds;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class GuildMemberPromoteEvent extends CoreEvent implements Cancellable {

    private final IGuild guild;
    private final ICorePlayer promoter;
    private final String target;
    private final long timestamp;

    public GuildMemberPromoteEvent(IGuild guild, ICorePlayer promoter, String target, long timestamp) {
        this.guild = guild;
        this.promoter = promoter;
        this.target = target;
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
