package com.conaxgames.api.interfaces.managers;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.interfaces.IGuild;
import com.conaxgames.api.objects.GuildRank;

import java.util.UUID;

public interface IGuildManager {

    boolean isRankedAtLeast(ICorePlayer corePlayer, GuildRank guildRank);

    IGuild getGuildAllMethods(String idOrName);

    IGuild getGuildByGuildID(int id);

    boolean hasGuildPvPBypass(UUID player1, UUID player2);

    void setGuildPvPBypass(UUID player1, UUID player2, boolean bypass);

}
