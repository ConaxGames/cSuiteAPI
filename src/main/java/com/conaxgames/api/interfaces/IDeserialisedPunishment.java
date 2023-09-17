package com.conaxgames.api.interfaces;

import com.conaxgames.api.objects.PunishType;

public interface IDeserialisedPunishment {

    PunishType getPunishType();

    String getId();

    String getReason();

    String getPunisher();

    long getCreatedAt();

    long getExpiry();

    long getDuration();

}
