package com.conaxgames.api.objects;

import com.google.gson.JsonObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServerData {

	private String serverName;
	private int onlinePlayers;
	private int maxPlayers;
	private long lastUpdate;
	private boolean joinable = true;
	private boolean whitelisted;
	private long startedAt;
	public double tps;
	private JsonObject extra;
}
