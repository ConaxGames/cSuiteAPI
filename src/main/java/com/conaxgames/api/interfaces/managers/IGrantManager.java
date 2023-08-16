package com.conaxgames.api.interfaces.managers;

import com.conaxgames.api.interfaces.IGrant;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface IGrantManager {

    CompletableFuture<List<IGrant>> loadIGrants(UUID uuid);

}
