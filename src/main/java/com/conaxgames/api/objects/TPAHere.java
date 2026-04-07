package com.conaxgames.api.objects;

import com.conaxgames.api.ICorePlayer;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class TPAHere {
    @NonNull private ICorePlayer sender;
    @NonNull private ICorePlayer receiver;
    private long sentAt;
    private boolean denied;
}
