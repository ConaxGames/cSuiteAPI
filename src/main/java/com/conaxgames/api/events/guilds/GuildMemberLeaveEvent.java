package com.conaxgames.api.events.guilds;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class GuildMemberLeaveEvent extends CoreEvent implements Cancellable {

    private final IGuild guild;
    private final ICorePlayer member;
    private final long timestamp;

    private boolean cancelled;

    public GuildMemberLeaveEvent(IGuild guild, ICorePlayer member, long timestamp) {
        this.guild = guild;
        this.member = member;
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
