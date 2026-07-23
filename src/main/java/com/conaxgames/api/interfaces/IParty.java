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

    void broadcast(String message);

    void broadcast(String message, UUID exclude);

    List<ICorePlayer> getOnlineMembers();

    void addMember(UUID playerId);

    void removeMember(UUID playerId);
}
