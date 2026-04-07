package com.conaxgames.api.interfaces;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.objects.RankWrapper;
import org.bson.Document;
import org.bukkit.plugin.Plugin;

import java.util.List;
import java.util.UUID;

public interface IRankPluginProvider {

    Plugin getPlugin();

    RankWrapper getRank(ICorePlayer corePlayer);

    RankWrapper getRank(String player);

    RankWrapper getRank(UUID player);

    IRank getEffectiveRank(UUID player);

    List<IRank> getRanks();

    double getRankWeight(ICorePlayer corePlayer);

    void loadRanksAndPerms(Document document, ICorePlayer corePlayer);

    void updatePermissions(ICorePlayer corePlayer, String reason);

}
