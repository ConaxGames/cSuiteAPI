package com.conaxgames.api.interfaces;

import com.conaxgames.api.ICorePlayer;

public interface IChatTag {

    String getName();

    String getNiceName();

    String getStyle();

    String getDescription();

    String getPermission();

    boolean isOnStore();

    boolean isSuffix();

    boolean isPrivate();

    boolean hasPermission(ICorePlayer corePlayer);

}
