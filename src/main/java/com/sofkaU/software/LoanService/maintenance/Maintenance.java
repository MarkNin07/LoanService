package com.sofkaU.software.LoanService.maintenance;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.software.LoanService.maintenance.values.MaintenanceId;

public class Maintenance extends AggregateEvent<MaintenanceId> {

    public Maintenance(MaintenanceId entityId) {
        super(entityId);
    }
}
