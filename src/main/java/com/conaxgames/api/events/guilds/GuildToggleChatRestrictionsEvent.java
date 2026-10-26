package com.conaxgames.api.events.guilds;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;

@Getter
public class GuildToggleChatRestrictionsEvent extends CoreCancellableEvent {

    private final IGuild guild;
    private final ICorePlayer changer;
    private final boolean newChatRestrictedValue;
    private final long timestamp;

    public GuildToggleChatRestrictionsEvent(IGuild guild, ICorePlayer changer, boolean newChatRestrictedValue, long timestamp) {
        this.guild = guild;
        this.changer = changer;
        this.newChatRestrictedValue = newChatRestrictedValue;
        this.timestamp = timestamp;
    }
}
