package com.conaxgames.api.events.guilds;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;
import org.bukkit.entity.Player;

@Getter
public class GuildMemberJoinEvent extends CoreEvent {

    private final IGuild guild;
    private final Player player;
    private final long timestamp;

    public GuildMemberJoinEvent(IGuild guild, Player joining, long timestamp) {
        this.guild = guild;
        this.player = joining;
        this.timestamp = timestamp;
    }
}
