package com.conaxgames.api.events.bungee;

import com.conaxgames.api.events.CoreEvent;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

@Getter
@Setter
public class BungeeConnectEvent extends CoreEvent implements Cancellable {

	private boolean cancelled;

	private Player player;
	private String server;

	public BungeeConnectEvent(Player player, String server) {
		this.player = player;
		this.server = server;
	}
}
