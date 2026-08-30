package com.conaxgames.api.events.schedule;

import com.conaxgames.api.events.CoreEvent;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ScheduledEventEvent extends CoreEvent {

    private final String eventName;
}
