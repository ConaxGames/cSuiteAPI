package com.conaxgames.api.events.core;

import com.conaxgames.api.events.CoreEvent;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Cancellable;

@Getter
@Setter
public class CorePluginPreShutdownEvent extends CoreEvent implements Cancellable {

    private boolean cancelled;

}
