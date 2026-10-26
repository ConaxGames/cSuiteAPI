package com.conaxgames.api.events;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.event.Cancellable;

/**
 * Base for cancellable events. One fired off the main thread runs right there as an async event, so
 * {@link #call()} can report whether a listener cancelled it without waiting on the main thread.
 */
@Getter
@Setter
public abstract class CoreCancellableEvent extends CoreEvent implements Cancellable {

    private boolean cancelled;

    protected CoreCancellableEvent() {
        super(!Bukkit.isPrimaryThread());
    }
}
