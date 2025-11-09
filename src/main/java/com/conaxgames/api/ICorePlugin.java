package com.conaxgames.api;

import com.conaxgames.api.interfaces.ICoreDatabase;
import com.conaxgames.api.interfaces.managers.*;
import com.conaxgames.libraries.LibraryPlugin;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bukkit.plugin.java.JavaPlugin;

public interface ICorePlugin {

    JavaPlugin getPlugin();

    LibraryPlugin getLibrary();

    MongoCollection<Document> getPlayersCollection();

    MongoCollection<Document> getGuildsCollection();

    ICoreDatabase getCoreDatabase();

    IPlayerManager getPlayerManager();

    IServerManager getServerManager();

    ISoundManager getSoundManager();

    IRankManager getRankManager();

    IGuildManager getGuildManager();

    IGrantManager getGrantManager();

    ITeleportManager getTeleportsManager();

    IChatTagManager getChatTagManager();

    INMSManager getNMSManager();

    IPaperManager getPaperManager();

    IPartyManager getPartyManager();
}
