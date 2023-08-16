package com.conaxgames.api.objects;

import lombok.*;
import org.bukkit.entity.Player;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class TPA {
    @NonNull private Player sender;
    @NonNull private Player receiver;
    private long sentAt;
    private boolean denied;
}
