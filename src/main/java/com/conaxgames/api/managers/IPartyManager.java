package com.conaxgames.api.managers;

import com.conaxgames.api.interfaces.IParty;

import java.util.UUID;

public interface IPartyManager {

    IParty getParty(UUID playerId);

    IParty createParty(UUID leader);

    void disbandParty(IParty party);

    void sendInvite(UUID inviter, UUID target);

    void acceptInvite(UUID playerId);

    UUID getInviter(UUID playerId);

    void removeInvite(UUID playerId);

    void removeFromParty(UUID playerId);
}
