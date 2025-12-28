package com.conaxgames.api.interfaces.database;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.interfaces.IPunishment;
import com.conaxgames.api.interfaces.IScope;
import com.conaxgames.api.interfaces.managers.IChatTagManager;
import com.conaxgames.api.objects.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import jdk.tools.jlink.plugin.Plugin;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bukkit.command.CommandSender;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.CompletableFuture;

public interface Connection {

    void closeConnection();

    // collections

    MongoDatabase getDatabase();
    MongoCollection<Document> getProfilesCollection();
    MongoCollection<Document> getChatTagsCollection();
    MongoCollection<Document> getPunishmentsCollection();
    MongoCollection<Document> getGuildsCollection();
    MongoCollection<Document> getGuildInvitesCollection();
    MongoCollection<Document> getGuildMembersCollection();
    MongoCollection<Document> getGrantsCollection();
    MongoCollection<Document> getRanksCollection();
    MongoCollection<Document> getAuditCollection();
    MongoCollection<Document> getNetworkCollection();
    MongoCollection<Scope> getScopesCollection();

    // core

    CompletableFuture<Boolean> profileAlreadyExists(UUID uuid);

    CompletableFuture<Boolean> profileAlreadyExists(String nameAnyCase);

    CompletableFuture<Boolean> createProfile(Bson filter, UUID uuid, String name);

    CompletableFuture<ICorePlayer> loadProfile(Bson filter, Boolean create, ICorePlayer corePlayer);

    CompletableFuture<Document> getProfileDocument(Bson filter);

    CompletableFuture<UUID> getUuid(String nameAnyCase);

    CompletableFuture<String> getName(UUID uuid);

    // profile

    CompletableFuture<Boolean> addGrant(UUID uuid, String grantId, String json);

    CompletableFuture<Boolean> removeGrant(UUID uuid, String grantId);

    CompletableFuture<Boolean> setSocials(UUID uuid, Map<String, String> links);

    CompletableFuture<Map<String, String>> getSocials(UUID uuid);

    CompletableFuture<Boolean> incrementFilterSpam(UUID uuid, Integer amount);

    CompletableFuture<Boolean> incrementFilterToxicity(UUID uuid, Integer amount);

    CompletableFuture<Boolean> setUnlockedChatTags(UUID uuid, String tags);

    CompletableFuture<Boolean> setUnlockedTagColors(UUID uuid, String colors);

    CompletableFuture<Boolean> setUnlockedNameColors(UUID uuid, String colors);

    CompletableFuture<Boolean> unsetActiveChatTag(UUID uuid);

    CompletableFuture<Boolean> setNetworkXP(UUID uuid, Integer amount);

    CompletableFuture<Boolean> addNetworkXP(UUID uuid, Integer amount);

    CompletableFuture<Boolean> setScopedPermissions(UUID uuid, HashMap<String, Map<String, Long>> perms);

    CompletableFuture<Boolean> setLanguage(UUID uuid, Language language);

    CompletableFuture<Boolean> unsetNickname(UUID uuid);

    CompletableFuture<Boolean> unsetCustomTagColor(UUID uuid);

    CompletableFuture<Boolean> setCustomColor(UUID uuid, String color);

    CompletableFuture<Boolean> unsetCustomColor(UUID uuid);

    CompletableFuture<List<OfflineWarn>> loadOfflineWarnings(UUID uuid);

    CompletableFuture<Boolean> addIgnoring(UUID uuid, String ignoreUuid);

    CompletableFuture<Boolean> removeIgnoring(UUID uuid, String ignoreUuid);

    CompletableFuture<Boolean> addFriend(UUID uuid, String friendUuid);

    CompletableFuture<Boolean> removeFriend(UUID uuid, String friendUuid);

    CompletableFuture<Boolean> setCurrency(UUID uuid, String currency, Integer amount);

    CompletableFuture<Boolean> setMute(UUID uuid, String mute);

    CompletableFuture<Boolean> unsetMute(UUID uuid);

    CompletableFuture<Boolean> setBan(UUID uuid, String mute);

    CompletableFuture<Boolean> unsetBan(UUID uuid);

    CompletableFuture<Boolean> setBlacklist(UUID uuid, String mute);

    CompletableFuture<Boolean> unsetBlacklist(UUID uuid);

    CompletableFuture<Boolean> setIPBan(UUID uuid, String mute);

    CompletableFuture<Boolean> unsetIPBan(UUID uuid);

    CompletableFuture<Boolean> setOfflineWarnings(UUID uuid, String mute);

    CompletableFuture<Boolean> unsetOfflineWarnings(UUID uuid);

    CompletableFuture<Boolean> setVanished(UUID uuid, Boolean value);

    CompletableFuture<Boolean> setStaffMode(UUID uuid, Boolean value);

    CompletableFuture<Boolean> setGlobalChatToggle(UUID uuid, Boolean value);

    CompletableFuture<Boolean> setPrivateMessageToggle(UUID uuid, Boolean value);

    CompletableFuture<Boolean> setStaffMessagesToggle(UUID uuid, Boolean value);

    CompletableFuture<Boolean> setUsernamesToggle(UUID uuid, Boolean value);

    CompletableFuture<Boolean> setSoundsToggle(UUID uuid, Boolean value);

    CompletableFuture<Boolean> setAutoBroadcastsToggle(UUID uuid, Boolean value);

    CompletableFuture<Boolean> setAutoBroadcastSoundsToggle(UUID uuid, Boolean value);

    CompletableFuture<Boolean> setAcceptingPaymentsToggle(UUID uuid, Boolean value);

    CompletableFuture<Boolean> setAcceptingTeleportsToggle(UUID uuid, Boolean value);

    CompletableFuture<Boolean> setSocialSpyToggle(UUID uuid, Boolean value);

    CompletableFuture<Boolean> setGlowToggle(UUID uuid, Boolean value);

    CompletableFuture<Boolean> setToggle(UUID uuid, String toggle, Boolean value);

    CompletableFuture<Boolean> setNickname(UUID uuid, String name);

    CompletableFuture<Boolean> setElement(UUID uuid, Boolean value);

    CompletableFuture<Boolean> unsetElement(UUID uuid);

    CompletableFuture<Boolean> setWorldTime(UUID uuid, String time);

    CompletableFuture<Boolean> setFrozen(UUID uuid, Boolean frozen);

    CompletableFuture<Boolean> onLogin(UUID uuid, String ipAddress, String lastAndCurrentServer, Long lastLogin);

    CompletableFuture<Boolean> onLogout(UUID uuid, Long playTime, HashMap<String, Long> scopedPlaytime, Long lastLogout);

    // staff inventory
    CompletableFuture<Boolean> setStaffInventory(UUID uuid, String base64Inventory, String base64Armor);
    CompletableFuture<Boolean> unsetStaffInventory(UUID uuid);

    // chat tags

    void loadChatTags(IChatTagManager tagManager);

    CompletableFuture<Boolean> createDefaultTags(IChatTagManager tagManager);

    void setActiveChatTag(UUID uuid, String tagName);

    void setCustomTagColor(UUID uuid, String tagColor);

    void createChatTag(Document document);

    CompletableFuture<Boolean> deleteChatTag(Bson filter);

    CompletableFuture<Document> getChatTag(String name);

    CompletableFuture<Boolean> chatTagAlreadyExists(String name);

    CompletableFuture<Boolean> updateChatTag(Bson filter, Bson update);

    // scope

    void createScope(Scope scope);

    CompletableFuture<Boolean> deleteScope(Bson filter);

    CompletableFuture<IScope> getScope(String id);

    CompletableFuture<Boolean> scopeAlreadyExists(String id);

    // punishments

    CompletableFuture<List<IPunishment>> loadPunishments(UUID uuid);
    CompletableFuture<List<StaffHistoryPunishment>> loadStaffHistory(UUID uuid);

    // audit

    void audit(UUID uuid, String currentUsername, String key, List<Pair<String, Object>> fields);

    // network config

    CompletableFuture<Document> getNetworkConfigDocument();

    CompletableFuture<Boolean> updateNetworkConfig(CommandSender sender, Field field, String newValue);
}
