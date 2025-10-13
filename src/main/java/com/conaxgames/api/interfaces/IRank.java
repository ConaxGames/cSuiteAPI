package com.conaxgames.api.interfaces;

import java.util.List;

public interface IRank {

    String getId();

    int getWeight();

    String getName();

    String getPrefix();

    String getColor();

    List<String> getPermissions();

    List<String> getInherits();

}
