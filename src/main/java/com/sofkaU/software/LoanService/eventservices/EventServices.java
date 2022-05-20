package com.sofkaU.software.LoanService.eventservices;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.software.LoanService.eventservices.values.EventId;
import com.sofkaU.software.LoanService.shared.Name;

public class EventServices extends AggregateEvent<EventId> {

    public EventServices(EventId entityId, Name name) {
        super(entityId);
    }
}
