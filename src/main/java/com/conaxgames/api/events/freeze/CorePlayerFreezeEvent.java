package com.conaxgames.api.events.freeze;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CorePlayerFreezeEvent extends CoreEvent {

    private final ICorePlayer corePlayer;
}
