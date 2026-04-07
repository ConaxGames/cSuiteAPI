package com.conaxgames.api.interfaces;

import com.conaxgames.api.ICorePlayer;
import org.bukkit.ChatColor;

public interface IChatTagColor {

    String getName();

    String getDisplay();

    String getColorCC();

    String getPermission();

    ChatColor getChatColor();

    boolean hasPermission(ICorePlayer corePlayer);

}
