package com.conaxgames.api.database;

import com.conaxgames.api.managers.ICoreRedisManager;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.concurrent.Executor;

public interface ICoreDatabase {

    Executor POOL();

    Connection getMongo();

    default Connection getConnection() {
        return getMongo();
    }

    default MongoCollection<Document> getCollection(String name) {
        return getMongo().getDatabase().getCollection(name);
    }

    ICoreRedisManager getRedis();

}
