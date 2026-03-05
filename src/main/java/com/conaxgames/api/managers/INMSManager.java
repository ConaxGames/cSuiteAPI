package com.conaxgames.api.managers;

import com.conaxgames.api.objects.ServerVersion;

public interface INMSManager {

    ServerVersion getServerVersion();

    double getAverageTPS();

}
