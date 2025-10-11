package com.conaxgames.api.objects;

import lombok.Getter;

import java.util.UUID;

@Getter
public class PartyInvite {

    private final UUID inviter;
    private final UUID target;
    private final long timestamp;

    public PartyInvite(UUID inviter, UUID target) {
        this.inviter = inviter;
        this.target = target;
        this.timestamp = System.currentTimeMillis();
    }

    public boolean isExpired(long expirationTime) {
        return System.currentTimeMillis() - timestamp > expirationTime;
    }
}
