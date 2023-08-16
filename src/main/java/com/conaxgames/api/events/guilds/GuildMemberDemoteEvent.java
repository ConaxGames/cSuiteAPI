package com.conaxgames.api.events.guilds;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class GuildMemberDemoteEvent extends CoreEvent implements Cancellable {

    private final IGuild guild;
    private final ICorePlayer demoter;
    private final String target;
    private final long timestamp;

    public GuildMemberDemoteEvent(IGuild guild, ICorePlayer demoter, String target, long timestamp) {
        this.guild = guild;
        this.demoter = demoter;
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
