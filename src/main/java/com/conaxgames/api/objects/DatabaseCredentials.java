package com.conaxgames.api.objects;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class DatabaseCredentials {

    private final String prefix;

    private final String host;
    private final int port;
    private final String database;
    private final String username;
    private final String password;

}
