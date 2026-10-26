package com.conaxgames.api.database;

import com.conaxgames.api.interfaces.IPunishment;
import com.conaxgames.api.interfaces.IScope;
import com.conaxgames.api.managers.IChatTagManager;
import com.conaxgames.api.objects.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bukkit.command.CommandSender;

import java.lang.reflect.Field;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface Connection {

    void closeConnection();

    MongoDatabase getDatabase();

    MongoCollection<Document> getProfilesCollection();

    MongoCollection<Document> getPunishmentsCollection();

    MongoCollection<Document> getGuildsCollection();

    MongoCollection<Document> getGuildMembersCollection();

    MongoCollection<Document> getGrantsCollection();

    MongoCollection<Document> getRanksCollection();

    MongoCollection<Document> getAuditCollection();

    MongoCollection<Scope> getScopesCollection();

    /**
     * Applies an update to a player's profile. When the player isn't online on this server,
     * whichever server holds them is told to reload the profile so its cached copy stays current.
     */
    CompletableFuture<Boolean> update(UUID uuid, Bson update);

    CompletableFuture<UUID> getUuid(String nameAnyCase);

    /**
     * Loads every chat tag into the manager, seeding the defaults first when none exist.
     */
    void loadChatTags(IChatTagManager tagManager);

    void createChatTag(Document document);

    CompletableFuture<Boolean> deleteChatTag(Bson filter);

    CompletableFuture<Boolean> updateChatTag(Bson filter, Bson update);

    void createScope(Scope scope);

    CompletableFuture<Boolean> deleteScope(Bson filter);

    CompletableFuture<IScope> getScope(String id);

    CompletableFuture<List<IPunishment>> loadPunishments(UUID uuid);

    CompletableFuture<List<StaffHistoryPunishment>> loadStaffHistory(UUID uuid);

    CompletableFuture<Void> pushInventoryBackup(UUID uuid, String serverId, String type, long at, String base64);

    CompletableFuture<List<Document>> loadInventoryBackups(UUID uuid, String serverId, String type);

    void audit(UUID uuid, String currentUsername, String key, List<Pair<String, Object>> fields);

    CompletableFuture<Document> getNetworkConfigDocument();

    CompletableFuture<Boolean> updateNetworkConfig(CommandSender sender, Field field, String newValue);
}
