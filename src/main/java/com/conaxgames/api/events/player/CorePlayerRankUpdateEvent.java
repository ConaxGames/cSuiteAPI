package com.conaxgames.api.events.player;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.events.IBaseEvent;
import com.conaxgames.api.interfaces.IRank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class CorePlayerRankUpdateEvent extends CoreEvent {

	private final ICorePlayer corePlayer;
	private final IRank from;
	private final IRank to;

}
