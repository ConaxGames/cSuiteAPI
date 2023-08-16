package com.conaxgames.api.events.guilds;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class GuildRenameEvent extends CoreEvent implements Cancellable {

    private final IGuild guild;
    private final ICorePlayer leader;
    private final String newGuildName;
    private final long timestamp;

    private boolean cancelled;

    public GuildRenameEvent(IGuild guild, ICorePlayer leader, String newGuildName, long timestamp) {
        this.guild = guild;
        this.leader = leader;
        this.newGuildName = newGuildName;
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
