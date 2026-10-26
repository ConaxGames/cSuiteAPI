package com.conaxgames.api.events.guilds;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;

@Getter
public class GuildMemberKickEvent extends CoreCancellableEvent {

    private final IGuild guild;
    private final ICorePlayer leader;
    private final String kicked;
    private final String reason;
    private final long timestamp;

    public GuildMemberKickEvent(IGuild guild, ICorePlayer leader, String kicked, String reason, long timestamp) {
        this.guild = guild;
        this.leader = leader;
        this.kicked = kicked;
        this.reason = reason;
        this.timestamp = timestamp;
    }
}
