package com.conaxgames.api;

import com.conaxgames.api.interfaces.*;
import com.conaxgames.api.interfaces.managers.IGuildMember;
import com.conaxgames.api.objects.ChatType;
import com.conaxgames.api.objects.Language;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public interface ICorePlayer {

    UUID getUuid();

    String getName();

    String getLowerCaseName();

    IRank getEffectiveRank();

    List<String> getOwnedPermissions();

    HashMap<String, Map<String, Long>> getScopedPermissions();

    boolean isBlacklisted();

    IDeserialisedPunishment getBlacklistPunishment();

    boolean isBanned();

    IDeserialisedPunishment getBanPunishment();

    boolean isMuted();

    IDeserialisedPunishment getMutePunishment();

    String getCustomColor();

    ChatType getChatType();

    long getTotalPlayTime();

    long getLastLogin();

    IChatTag getActiveChatTag();

    Set<? extends IChatTag> getUnlockedChatTags();

    IChatTagColor getCustomTagColor();

    String getNickname();

    long getReportCooldown();

    long getCommandCooldown();

    long getChatCooldown();

    boolean isWaitingToWarp();

    boolean isWaitingToSpawn();

    boolean isWaitingToTPA();

    boolean isWaitingToHome();

    boolean isWaitingToBack();

    boolean isWaitingToTPAHere();

    boolean isSeePrivateMessages();

    boolean isSeeStaffMessages();

    boolean isSeeSocialSpy();

    boolean isViewingGlobalChat();

    boolean isPrivateMessageSounds();

    boolean isAuthExempt();

    boolean isAuthenticated();

    boolean isSetupAuth();

    boolean isDataLoaded();

    boolean isVanished();

    boolean isStaffMode();

    boolean isAcceptingPayments();

    boolean isAcceptingTeleportRequests();

    boolean isElement();

    boolean isSeeAutoBroadcasts();

    boolean isAutoBroadcastSounds();

    boolean isOnline();

    ItemStack[] getStaffInventory();

    ItemStack[] getStaffArmor();

    Set<String> getFriends();

    void sendMessage(String message);

    Player getPlayer();

    IGuild getGuild();

    long getLastLoginStreak();

    int getLoginStreak();

    void setLoginStreak(int value);

    void setLastLoginStreak(long timeStamp);

    String getDisplayName();

    long getUpdatedPlaytimeLong();

    long getUpdatedScopedPlaytime();

    String getPlaytimeString();

    String getServerPlaytimeString();

    List<? extends IRank> getRanks();

    int getCoins();

    int getBalance(String currency);

    void addCurrency(String currency, int amount, boolean multi, String reason, boolean message);

    void setCurrency(String currency, int amount, String reason, boolean message);

    void removeCurrency(String currency, int amount, String reason, boolean message);

    boolean canAfford(String currency, int amount);

    boolean isInventoryEmpty();

    IGuildMember getGuildMember();

    Language getLanguage();

    void setDisguiseRank(IRank rank);

    void addChatTag(IChatTag tag);

    void setHomeLimit(int homes);

}
