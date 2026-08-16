package com.conaxgames.api.interfaces;

import java.util.Set;
import java.util.UUID;

public interface IParty {

    UUID getLeader();

    /**
     * The live member set. Read-only for consumers, the party manager is the only mutator.
     */
    Set<UUID> getMembers();

    boolean isLeader(UUID playerId);

    boolean isMember(UUID playerId);

    void broadcast(String message);
}
