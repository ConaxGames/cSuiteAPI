package com.conaxgames.api.events.guilds;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;

@Getter
public class GuildInviteSendEvent extends CoreCancellableEvent {

    private final IGuild guild;
    private final ICorePlayer sender;
    private final ICorePlayer target;
    private final long timestamp;

    public GuildInviteSendEvent(IGuild guild, ICorePlayer sender, ICorePlayer target, long timestamp) {
        this.guild = guild;
        this.sender = sender;
        this.target = target;
        this.timestamp = timestamp;
    }
}
