package com.conaxgames.api.interfaces;

import org.bukkit.entity.Player;

public interface IChatTag {

    String getName();

    String getNiceName();

    String getStyle();

    String getDescription();

    String getPermission();

    boolean isOnStore();

    boolean isSuffix();

    boolean isPrivate();

    boolean hasPermission(Player player);

}
