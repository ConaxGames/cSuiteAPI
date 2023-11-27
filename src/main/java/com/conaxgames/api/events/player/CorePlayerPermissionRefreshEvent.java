package com.conaxgames.api.events.player;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import lombok.Getter;
import org.bukkit.entity.Player;

import javax.annotation.Nullable;

@Getter
public class CorePlayerPermissionRefreshEvent extends CoreEvent {

    private final ICorePlayer corePlayer;
    @Nullable private final Player player;
    private final String reason;
    private final Long currentSystemLong;

    public CorePlayerPermissionRefreshEvent(ICorePlayer corePlayer, @Nullable Player player, String reason) {
        this.corePlayer = corePlayer;
        this.player = player;
        this.reason = reason;
        this.currentSystemLong = System.currentTimeMillis();
    }
}
