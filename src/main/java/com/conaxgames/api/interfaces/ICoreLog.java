package com.conaxgames.api.interfaces;

import org.bukkit.entity.Player;

public interface ICoreLog {

    void announceCorePluginBanner(Player target);

    void announceGrantCreation(IGrant grant);

    void announceGrantDeletion(IGrant grant);

    void announcePermissionCreation(String admin, String receiver, String permission, String scope, String duration);

    void announcePermissionDeletion(String admin, String receiver, String permission, String scope);
}
