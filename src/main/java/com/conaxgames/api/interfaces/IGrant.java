package com.conaxgames.api.interfaces;

import java.util.UUID;

public interface IGrant {

    String getDocumentID();

    UUID getReceiver();

    String getReceiverName();

    UUID getGiver();

    String getGiverName();

    IRank getRank();

    IScope getScope();

    long getCreatedAt();

    String getCreatedReason();

    long getDuration ();

    boolean isActive();

    boolean isRemoved();

    UUID getRemover();

    String getRemoverName();

    long getRemovedAt();

    String getRemovalReason();
}
