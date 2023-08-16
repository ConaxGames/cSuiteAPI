package com.conaxgames.api.events.guilds;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.interfaces.IGuild;
import com.conaxgames.api.interfaces.managers.IGuildMember;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class GuildTransferOwnershipEvent extends CoreEvent implements Cancellable {

    private final IGuild guild;
    private final ICorePlayer leader;
    private final IGuildMember targetGuildMember;
    private final long timestamp;

    private boolean cancelled;

    public GuildTransferOwnershipEvent(IGuild guild, ICorePlayer leader, IGuildMember targetGuildMember, long timestamp) {
        this.guild = guild;
        this.leader = leader;
        this.targetGuildMember = targetGuildMember;
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
