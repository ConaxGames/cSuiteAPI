package com.conaxgames.api.events.guilds;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

@Getter
public class GuildMemberKickEvent extends CoreEvent implements Cancellable {

    private final IGuild guild;
    private final Player leader;
    private final String kicked;
    private final String reason;
    private final long timestamp;

    private boolean cancelled;

    public GuildMemberKickEvent(IGuild guild, Player leader, String kicked, String reason, long timestamp) {
        this.guild = guild;
        this.leader = leader;
        this.kicked = kicked;
        this.reason = reason;
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
