package com.conaxgames.api.objects;

import com.conaxgames.api.interfaces.IServerType;

public enum ServerType implements IServerType {

    FFA("FFA", "ffa"),
    HUB("Hub", "Hub"),
    SG("SG", "sg"),
    SKYWARS("SkyWars", "skywars"),
    TOURNAMENT("Tournament", "tournament"),
    UHC("UHC", "uhc"),
    UHCMEETUP("UHC Meetup", "uhcmeetup"),
    ARENAPVP("Practice", "arenapvp"),
    SKYBLOCK("Skyblock", "skyblock"),
    UNKNOWN("Unknown", "unknown");

    private String name;
    private String internalName;

    ServerType(String name, String internalName) {
        this.name = name;
        this.internalName = internalName;
    }

    public String getName() {
        return name;
    }

    public String getInternalName() {
        return internalName;
    }

}
