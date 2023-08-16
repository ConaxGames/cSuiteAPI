package com.conaxgames.api.events.guilds;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class GuildInviteSendEvent extends CoreEvent implements Cancellable {

    private final IGuild guild;
    private final ICorePlayer sender;
    private final ICorePlayer target;
    private final long timestamp;

    private boolean cancelled;

    public GuildInviteSendEvent(IGuild guild, ICorePlayer sender, ICorePlayer target, long timestamp) {
        this.guild = guild;
        this.sender = sender;
        this.target = target;
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
