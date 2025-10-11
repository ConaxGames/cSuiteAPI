package com.conaxgames.api.interfaces;

import com.conaxgames.api.ICorePlayer;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface IParty {

    UUID getLeader();

    Set<UUID> getMembers();

    boolean isLeader(UUID playerId);

    boolean isMember(UUID playerId);

    int getSize();

    long getCreatedAt();

    boolean isEmpty();

    void broadcast(String message);

    void broadcast(String message, UUID exclude);

    List<ICorePlayer> getOnlineMembers();

    void transferLeadership(UUID newLeader);

    UUID getNextLeader();

    void addMember(UUID playerId);

    void removeMember(UUID playerId);
}
