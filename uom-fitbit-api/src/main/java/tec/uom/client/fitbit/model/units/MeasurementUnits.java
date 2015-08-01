package tec.uom.client.fitbit.model.units;

import javax.measure.Unit;
import javax.measure.quantity.Length;

import tec.uom.se.util.SI;
import tec.uom.se.util.SIPrefix;
import tec.uom.se.util.UCUM;

public enum MeasurementUnits {
	CM(SIPrefix.CENTI(SI.METRE)),
    INCHES(UCUM.INCH_US_SURVEY);

    Unit<Length> unitRepresentation;

    MeasurementUnits(Unit<Length> unitRepresentation) {
        this.unitRepresentation = unitRepresentation;
    }

    public Unit<Length> getUnitRepresentation() {
        return unitRepresentation;
    }
}