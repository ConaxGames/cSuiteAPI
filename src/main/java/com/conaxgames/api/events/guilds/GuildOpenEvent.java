package com.conaxgames.api.events.guilds;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;

@Getter
public class GuildOpenEvent extends CoreCancellableEvent {

    private final IGuild guild;
    private final ICorePlayer leader;
    private final long timestamp;

    public GuildOpenEvent(IGuild guild, ICorePlayer leader, long timestamp) {
        this.guild = guild;
        this.leader = leader;
        this.timestamp = timestamp;
    }
}
