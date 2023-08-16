package com.conaxgames.api;

import java.util.UUID;

public interface IPlayerManager {

//    Optional<ICorePlayer> getCorePlayer(UUID uuid);
//
//    Optional<ICorePlayer> getCorePlayer(String name);

    ICorePlayer getPlayer(UUID uuid);

    ICorePlayer getPlayer(String name);
}
