package com.conaxgames.api.interfaces;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.objects.Pair;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;

public interface ICoreLog {

    void announceCorePluginBanner(Player target);

    void announceGrantCreation(IGrant grant);

    void announceGrantDeletion(IGrant grant);

    void announcePermissionCreation(String admin, String receiver, String permission, String scope, String duration);

    void announcePermissionDeletion(String admin, String receiver, String permission, String scope);

    void audit(ICorePlayer corePlayer, String key, List<Pair<String, String>> pairs);

    //

    void sendInfo(String action, String message);

    void sendInfo(String action, List<String> message);

    void sendDebug(String action, String message);

    void sendDebug(String action, List<String> message);

}
