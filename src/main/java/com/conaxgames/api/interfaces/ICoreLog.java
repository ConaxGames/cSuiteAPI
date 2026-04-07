package com.conaxgames.api.interfaces;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.objects.Pair;

import java.util.List;

public interface ICoreLog {

    void announceCorePluginBanner(ICorePlayer target);

    void announceGrantCreation(IGrant grant);

    void announceGrantDeletion(IGrant grant);

    void announcePermissionCreation(String admin, String receiver, String permission, String scope, String duration);

    void announcePermissionDeletion(String admin, String receiver, String permission, String scope);

    void audit(ICorePlayer corePlayer, String key, List<Pair<String, Object>> pairs);

    void sendInfo(String action, String message, Throwable... throwables);

    void sendInfo(String action, List<String> message, Throwable... throwables);

    void sendDebug(String action, String message, Throwable... throwables);

    void sendDebug(String action, List<String> message, Throwable... throwables);

}
