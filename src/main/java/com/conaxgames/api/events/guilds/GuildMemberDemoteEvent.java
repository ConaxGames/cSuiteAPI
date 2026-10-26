package com.conaxgames.api.events.guilds;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;

@Getter
public class GuildMemberDemoteEvent extends CoreCancellableEvent {

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
}
