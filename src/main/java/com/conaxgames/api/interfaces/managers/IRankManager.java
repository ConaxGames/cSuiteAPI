package com.conaxgames.api.interfaces.managers;

import com.conaxgames.api.interfaces.IRank;

public interface IRankManager {

    IRank getDefaultRank();

    IRank getRankById(String id);
}
