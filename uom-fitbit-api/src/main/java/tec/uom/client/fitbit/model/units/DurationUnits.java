package tec.uom.client.fitbit.model.units;

import javax.measure.Unit;
import javax.measure.quantity.Time;

import tec.uom.se.util.SI;
import tec.uom.se.util.SIPrefix;

public enum DurationUnits {
    MS(SIPrefix.MILLI(SI.SECOND)),
    MIN(SI.MINUTE);
    
    Unit<Time> unitRepresentation;

    DurationUnits(Unit<Time> unitRepresentation) {
        this.unitRepresentation = unitRepresentation;
    }

    public Unit<Time> getUnitRepresentation() {
        return unitRepresentation;
    }
}
