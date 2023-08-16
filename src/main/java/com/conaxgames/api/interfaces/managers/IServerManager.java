package com.conaxgames.api.interfaces.managers;

import com.conaxgames.api.interfaces.INetwork;
import com.conaxgames.api.interfaces.IScope;
import com.conaxgames.api.interfaces.IServerType;
import com.conaxgames.api.objects.ServerData;

import java.util.List;
import java.util.Map;

public interface IServerManager {

    String getServerName();

    INetwork getNetwork();

    List<String> getLoadedScopes();

    List<? extends IScope> getLoadedScopeObjects();

    Map<String, ServerData> getServers();

    ServerData getServerDataByName(String name);
}
