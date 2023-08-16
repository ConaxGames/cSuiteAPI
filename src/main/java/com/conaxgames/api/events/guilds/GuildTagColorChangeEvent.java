package com.conaxgames.api.events.guilds;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.interfaces.IGuild;
import com.conaxgames.api.interfaces.IGuildTagColor;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class GuildTagColorChangeEvent extends CoreEvent implements Cancellable {

    private final IGuild guild;
    private final ICorePlayer leader;
    private final IGuildTagColor guildTagColor;
    private final long timestamp;

    private boolean cancelled;

    public GuildTagColorChangeEvent(IGuild guild, ICorePlayer leader, IGuildTagColor guildTagColor, long timestamp) {
        this.guild = guild;
        this.leader = leader;
        this.guildTagColor = guildTagColor;
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
