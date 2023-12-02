package com.conaxgames.api.events.economy;

import com.conaxgames.api.events.CoreEvent;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.OfflinePlayer;

@Getter
@RequiredArgsConstructor
public class EconomyPlayerDepositEvent extends CoreEvent {

    private final OfflinePlayer player;
    private final double amount;
    private final boolean success;

}
