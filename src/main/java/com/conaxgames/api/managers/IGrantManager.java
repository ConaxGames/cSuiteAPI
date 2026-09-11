package com.conaxgames.api.managers;

import com.conaxgames.api.interfaces.IGrant;
import com.conaxgames.api.interfaces.IRank;
import com.conaxgames.api.interfaces.IScope;
import org.bukkit.command.CommandSender;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface IGrantManager {

    CompletableFuture<List<IGrant>> loadIGrants(UUID uuid);

    CompletableFuture<IGrant> createGrant(CommandSender sender, UUID target, IRank rank, IScope scope, long duration, String reason);

    CompletableFuture<Boolean> removeGrant(CommandSender sender, IGrant grant, String reason);

}
