package com.conaxgames.api.events;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Cancellable;

@Getter
@Setter
public class CoreCancellableEvent extends CoreEvent implements Cancellable {

	private boolean cancelled;

}
