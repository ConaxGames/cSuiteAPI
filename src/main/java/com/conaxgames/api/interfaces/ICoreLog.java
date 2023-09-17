package com.conaxgames.api.interfaces;

import org.bukkit.entity.Player;

import java.util.List;

public interface ICoreLog {

    void announceCorePluginBanner(Player target);

    void announceGrantCreation(IGrant grant);

    void announceGrantDeletion(IGrant grant);

    void announcePermissionCreation(String admin, String receiver, String permission, String scope, String duration);

    void announcePermissionDeletion(String admin, String receiver, String permission, String scope);

    void sendInfo(String action, String message);

    void sendInfo(String action, List<String> message);

    void sendDebug(String action, String message);

    void sendDebug(String action, List<String> message);

}
