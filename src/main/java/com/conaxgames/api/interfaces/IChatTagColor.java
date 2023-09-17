package com.conaxgames.api.interfaces;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public interface IChatTagColor {

    String getName();

    String getDisplay();

    String getColorCC();

    String getPermission();

    ChatColor getChatColor();

    boolean hasPermission(Player player);

}
