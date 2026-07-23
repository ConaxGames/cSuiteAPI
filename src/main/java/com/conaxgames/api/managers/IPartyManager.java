package com.conaxgames.api.managers;

import com.conaxgames.api.interfaces.IParty;

import java.util.UUID;

public interface IPartyManager {

    IParty createParty(UUID leader);

    void disbandParty(IParty party);

    IParty getParty(UUID playerId);

    boolean isInParty(UUID playerId);

    void addToParty(IParty party, UUID playerId);

    void removeFromParty(UUID playerId);

    void sendInvite(UUID inviter, UUID target);

    boolean hasPendingInvite(UUID playerId);

    UUID getInviter(UUID playerId);

    void removeInvite(UUID playerId);

    void acceptInvite(UUID playerId);

    int getMaxPartySize();
}
