package com.conaxgames.api.objects;

import com.cryptomorin.xseries.XMaterial;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class DailyStreakReward {

    private final int streak;
    private final List<String> commands;
    private final List<String> description;
    private final XMaterial xMaterial;

}
