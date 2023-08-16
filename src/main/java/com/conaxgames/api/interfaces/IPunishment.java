package com.conaxgames.api.interfaces;

import com.conaxgames.api.objects.PunishType;

import java.util.UUID;

public interface IPunishment {


    String getId();
    PunishType getType();
    UUID getTargetUuid();
    String getTargetName();
    UUID getCreatedBy();
    String getCreatorName();
    long getCreatedAt();
    String getReason();
    String getProof();
    UUID getRemovedBy();
    String getRemoverName();
    long getRemovedAt();
    String getRemovalReason();
    long getDuration();

    boolean isActive();
    boolean isRemoved();
    boolean isPermanent();
    boolean hasProof();

    String getDurationString();
    String getExpirationString();
    String getRemovalTimeString();
}
