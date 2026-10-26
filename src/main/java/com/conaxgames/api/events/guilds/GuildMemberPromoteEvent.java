package com.conaxgames.api.events.guilds;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;

@Getter
public class GuildMemberPromoteEvent extends CoreCancellableEvent {

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
}
