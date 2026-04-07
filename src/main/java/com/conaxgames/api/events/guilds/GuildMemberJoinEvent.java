package com.conaxgames.api.events.guilds;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;

@Getter
public class GuildMemberJoinEvent extends CoreEvent {

    private final IGuild guild;
    private final ICorePlayer member;
    private final long timestamp;

    public GuildMemberJoinEvent(IGuild guild, ICorePlayer member, long timestamp) {
        this.guild = guild;
        this.member = member;
        this.timestamp = timestamp;
    }
}
