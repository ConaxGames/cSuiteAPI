package com.conaxgames.api.events.guilds;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import com.conaxgames.api.interfaces.IGuild;
import com.conaxgames.api.managers.IGuildMember;
import lombok.Getter;

@Getter
public class GuildTransferOwnershipEvent extends CoreCancellableEvent {

    private final IGuild guild;
    private final ICorePlayer leader;
    private final IGuildMember targetGuildMember;
    private final long timestamp;

    public GuildTransferOwnershipEvent(IGuild guild, ICorePlayer leader, IGuildMember targetGuildMember, long timestamp) {
        this.guild = guild;
        this.leader = leader;
        this.targetGuildMember = targetGuildMember;
        this.timestamp = timestamp;
    }
}
