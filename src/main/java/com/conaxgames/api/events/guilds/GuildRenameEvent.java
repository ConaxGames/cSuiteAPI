package com.conaxgames.api.events.guilds;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;

@Getter
public class GuildRenameEvent extends CoreCancellableEvent {

    private final IGuild guild;
    private final ICorePlayer leader;
    private final String newGuildName;
    private final long timestamp;

    public GuildRenameEvent(IGuild guild, ICorePlayer leader, String newGuildName, long timestamp) {
        this.guild = guild;
        this.leader = leader;
        this.newGuildName = newGuildName;
        this.timestamp = timestamp;
    }
}
