package com.conaxgames.api.objects;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PunishType {

    IPBAN("ipban"),
    BAN("ban"),
    BLACKLIST("blacklist"),
    UNBLACKLIST("unblacklist"),
    UNBAN("unban"),
    MUTE("mute"),
    UNMUTE("unmute"),
    KICK("kick"),
    WARN("warn");

    private final String name;
}
