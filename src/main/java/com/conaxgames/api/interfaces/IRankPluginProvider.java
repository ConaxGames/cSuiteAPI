package com.conaxgames.api.interfaces;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.objects.RankWrapper;
import org.bson.Document;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.List;
import java.util.UUID;

public interface IRankPluginProvider {

    Plugin getPlugin();

    RankWrapper getRank(Player player);

    RankWrapper getRank(String player);

    RankWrapper getRank(UUID player);

    IRank getEffectiveRank(UUID player);

    List<IRank> getRanks();

    double getRankWeight(Player player);

    void loadRanksAndPerms(Document document, ICorePlayer corePlayer);

    void updatePermissions(Player player, ICorePlayer corePlayer, String reason);

}
