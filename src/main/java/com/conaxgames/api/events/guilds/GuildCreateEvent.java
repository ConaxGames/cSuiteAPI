package com.conaxgames.api.events.guilds;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;

@Getter
public class GuildCreateEvent extends CoreCancellableEvent {

    private final IGuild guild;
    private final ICorePlayer leader;
    private final long timestamp;

    public GuildCreateEvent(IGuild guild, ICorePlayer leader, long timestamp) {
        this.guild = guild;
        this.leader = leader;
        this.timestamp = timestamp;
    }
}
