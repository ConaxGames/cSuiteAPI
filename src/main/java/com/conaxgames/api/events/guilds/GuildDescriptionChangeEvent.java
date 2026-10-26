package com.conaxgames.api.events.guilds;

import com.conaxgames.api.ICorePlayer;
import com.conaxgames.api.events.CoreCancellableEvent;
import com.conaxgames.api.interfaces.IGuild;
import lombok.Getter;

@Getter
public class GuildDescriptionChangeEvent extends CoreCancellableEvent {

    private final IGuild guild;
    private final ICorePlayer changer;
    private final String newDescription;
    private final long timestamp;

    public GuildDescriptionChangeEvent(IGuild guild, ICorePlayer changer, String newDescription, long timestamp) {
        this.guild = guild;
        this.changer = changer;
        this.newDescription = newDescription;
        this.timestamp = timestamp;
    }
}
