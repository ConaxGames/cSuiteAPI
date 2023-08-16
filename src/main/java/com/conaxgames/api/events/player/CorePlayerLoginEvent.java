package com.conaxgames.api.events.player;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import lombok.Getter;
import org.bukkit.entity.Player;

@Getter
public class CorePlayerLoginEvent extends CoreEvent {

    private final Player player;
    private final ICorePlayer corePlayer;
    private final long timestamp;

    public CorePlayerLoginEvent(Player player, ICorePlayer corePlayer) {
        this.player = player;
        this.corePlayer = corePlayer;
        this.timestamp = System.currentTimeMillis();
    }
}
