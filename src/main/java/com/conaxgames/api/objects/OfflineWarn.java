package com.conaxgames.api.objects;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class OfflineWarn {

    public final String creator;
    public final String reason;

    public String getSerialized() {
        return creator + "`" + reason;
    }
}
