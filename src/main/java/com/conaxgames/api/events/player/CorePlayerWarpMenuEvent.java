package com.conaxgames.api.events.player;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CorePlayerWarpMenuEvent extends CoreEvent {

    private final ICorePlayer corePlayer;

}
