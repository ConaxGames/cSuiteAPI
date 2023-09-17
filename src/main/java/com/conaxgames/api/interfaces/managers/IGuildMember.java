package com.conaxgames.api.interfaces.managers;

import com.conaxgames.api.objects.GuildRank;

import java.util.UUID;

public interface IGuildMember {

    int getGuildId();

    UUID getUuid();

    String getName();

    GuildRank getRank();
}
