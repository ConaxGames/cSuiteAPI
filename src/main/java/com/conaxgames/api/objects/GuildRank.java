package com.conaxgames.api.objects;

import java.util.HashMap;
import java.util.Map;

public enum GuildRank {

    LEADER(1), OFFICER(2), MEMBER(3), RECRUIT(4);

    private static final Map<Integer, GuildRank> ranks = new HashMap<>();
    private final int pos;

    GuildRank(int pos) {
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }

    public static GuildRank get(int pos) {
        return GuildRank.ranks.get(pos);
    }

    static {
        for (GuildRank clanRank : GuildRank.values()) {
            GuildRank.ranks.put(clanRank.getPos(), clanRank);
        }
    }

}
