package com.conaxgames.api.events.guilds;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;

@Getter
public class GuildRetagEvent extends CoreCancellableEvent {

    private final IGuild guild;
    private final ICorePlayer leader;
    private final String newGuildTag;
    private final long timestamp;

    public GuildRetagEvent(IGuild guild, ICorePlayer leader, String newGuildTag, long timestamp) {
        this.guild = guild;
        this.leader = leader;
        this.newGuildTag = newGuildTag;
        this.timestamp = timestamp;
    }
}
