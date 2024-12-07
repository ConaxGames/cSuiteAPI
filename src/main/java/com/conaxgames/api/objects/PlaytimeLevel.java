package com.conaxgames.api.objects;

import com.conaxgames.libraries.xseries.XMaterial;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class PlaytimeLevel {

    private final int level;

    private final int playtimeMinutes;
    private final int votes;

    private final List<String> description;
    private final XMaterial xMaterial;

    private final List<String> rewards;
}

