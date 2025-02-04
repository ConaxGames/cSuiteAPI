package com.conaxgames.api;

import com.conaxgames.api.interfaces.ICoreDatabase;
import com.conaxgames.api.interfaces.managers.*;
import com.conaxgames.libraries.LibraryPlugin;
import com.conaxgames.libraries.acf.PaperCommandManager;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.List;

public interface ICorePlugin {

    JavaPlugin getPlugin();

    LibraryPlugin getLibrary();

    MongoCollection<Document> getPlayersCollection();

    MongoCollection<Document> getDisguisedPlayersCollection();

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

    ICommandRegistry getCommandRegistry();

    PaperCommandManager getPaperCommandManager();

    void sendCritical(String action, String info, Throwable... throwables);

    void sendInfo(String action, String info, Throwable... throwables);

    void sendCritical(String action, List<String> info, Throwable... throwables);

    void sendInfo(String action, List<String> info, Throwable... throwables);

    File getDataFolder();

    InputStream getResource(String path);

    DateFormat getDateFormat();

    void saveResource(String path, boolean overwrite);
}
