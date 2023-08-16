package com.conaxgames.api.interfaces.managers;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.interfaces.IGuild;
import com.conaxgames.api.objects.GuildRank;

public interface IGuildManager {

    boolean isRankedAtLeast(ICorePlayer corePlayer, GuildRank guildRank);

    IGuild getGuildAllMethods(String idOrName);

    IGuild getGuildByGuildID(int id);

    void updateGuildKillTotal(IGuild guild, int newAmount);

}
