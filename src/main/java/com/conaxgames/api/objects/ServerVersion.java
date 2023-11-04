package com.conaxgames.api.objects;

public enum ServerVersion {
    v1_8_R3,
    v1_9_R1,
    v1_12_R1,
    v1_15_R2,
    v1_16_R3,
    v1_17_R1,
    v1_18_R1,
    v1_18_R2,
    v1_19_R1,
    v1_19_R2,
    v1_19_R3,
    v1_19_R4,
    v1_20_R1,
    v1_20_R2;

    public boolean after(ServerVersion serverVersion) {
        return this.ordinal() > serverVersion.ordinal();
    }

    public boolean before(ServerVersion serverVersion) {
        return serverVersion.ordinal() > this.ordinal();
    }

}
