package com.conaxgames.api.interfaces;

import com.conaxgames.api.interfaces.database.Connection;
import com.conaxgames.api.interfaces.managers.ICoreRedisManager;

import java.util.concurrent.Executor;

public interface ICoreDatabase {

    Executor POOL();

    Connection getMongo();

    ICoreRedisManager getRedis();

}
