package com.conaxgames.api.managers;

import com.conaxgames.libraries.menu.Button;
import org.bukkit.entity.Player;

import java.util.function.Function;

public interface IPlayerSettingsManager {

    void addButton(Function<Player, Button> button);

    void addButton(String sortKey, String permission, Function<Player, Button> button);
}
