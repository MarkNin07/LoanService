package com.sofkaU.software.LoanService.loanservices;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.software.LoanService.loanservices.values.ServiceId;


public class LoanServices extends AggregateEvent <ServiceId>{

    public LoanServices(ServiceId entityId) {
        super(entityId);
    }
}
