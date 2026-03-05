package com.conaxgames.api.managers;

import com.conaxgames.api.objects.GuildRank;

import java.util.UUID;

public interface IGuildMember {

    int getGuildId();

    UUID getUuid();

    String getName();

    GuildRank getRank();
}
