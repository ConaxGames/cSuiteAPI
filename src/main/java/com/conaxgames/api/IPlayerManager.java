package com.conaxgames.api;

import java.util.UUID;

public interface IPlayerManager {

    ICorePlayer getPlayer(UUID uuid);

    ICorePlayer getPlayer(String name);
}
