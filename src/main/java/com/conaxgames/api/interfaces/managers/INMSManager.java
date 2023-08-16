package com.conaxgames.api.interfaces.managers;

import com.conaxgames.api.objects.ServerVersion;

public interface INMSManager {

    ServerVersion getServerVersion();

    double getAverageTPS();

}
