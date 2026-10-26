package com.conaxgames.api.database;

import com.conaxgames.api.managers.ICoreRedisManager;
import com.mongodb.client.MongoCollection;
import org.bson.Document;


public interface ICoreDatabase {

    Connection getConnection();

    default MongoCollection<Document> getCollection(String name) {
        return getConnection().getDatabase().getCollection(name);
    }

    ICoreRedisManager getRedis();

}
