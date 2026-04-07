package com.conaxgames.api.events.player;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreEvent;
import lombok.Getter;
import org.bukkit.event.Cancellable;

@Getter
public class CorePlayerPrivateMessageEvent extends CoreEvent implements Cancellable {

    private final ICorePlayer from;
    private final ICorePlayer to;
    private boolean cancelled;

    public CorePlayerPrivateMessageEvent(ICorePlayer from, ICorePlayer to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }
}
