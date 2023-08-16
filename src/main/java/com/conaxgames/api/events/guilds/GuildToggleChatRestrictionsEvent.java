package com.conaxgames.api.events.guilds;

import com.conaxgames.api.events.CoreEvent;
import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class GuildToggleChatRestrictionsEvent extends CoreEvent implements Cancellable {

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

    private boolean cancelled;

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }
}
