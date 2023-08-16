package com.conaxgames.api.events.player;

import com.conaxgames.api.events.CoreEvent;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.entity.Player;

@Getter
@Setter
@RequiredArgsConstructor
public class CorePlayerWarpMenuEvent extends CoreEvent {

    private final Player player;

}
