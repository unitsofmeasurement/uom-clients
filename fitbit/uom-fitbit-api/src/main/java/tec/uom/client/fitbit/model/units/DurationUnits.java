package tec.uom.client.fitbit.model.units;

import static tech.units.indriya.unit.Units.*;

import javax.measure.Unit;
import javax.measure.quantity.Time;

import javax.measure.MetricPrefix;

public enum DurationUnits {
    MS(MetricPrefix.MILLI(SECOND)),
    MIN(MINUTE);
    
    Unit<Time> unitRepresentation;

    DurationUnits(Unit<Time> unitRepresentation) {
        this.unitRepresentation = unitRepresentation;
    }

    public Unit<Time> getUnitRepresentation() {
        return unitRepresentation;
    }
}
