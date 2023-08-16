package com.conaxgames.api.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class IBaseEvent extends Event {

	private static final HandlerList handlers = new HandlerList();

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

}
