package com.conaxgames.api.events.bungee;

import com.conaxgames.api.events.CoreEvent;
import lombok.Getter;
import org.bukkit.entity.Player;

@Getter
public class BungeeReceivedEvent extends CoreEvent {

	private final Player player;

	private final String channel;
	private final String message;

	private final byte[] messageBytes;
	private final boolean isValid;

	public BungeeReceivedEvent(Player player, String channel, String message, byte[] messageBytes, boolean isValid) {
		this.player = player;
		this.channel = channel;
		this.message = message;
		this.messageBytes = messageBytes;
		this.isValid = isValid;
	}

}
