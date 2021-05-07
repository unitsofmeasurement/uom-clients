package tec.uom.client.fitbit.model.units;

import javax.measure.Unit;
import javax.measure.quantity.Length;

import tech.units.indriya.unit.Units;
import javax.measure.MetricPrefix;
import systems.uom.common.USCustomary;

public enum MeasurementUnits {
	CM(MetricPrefix.CENTI(Units.METRE)),
    INCHES(USCustomary.INCH);

    Unit<Length> unitRepresentation;

    MeasurementUnits(Unit<Length> unitRepresentation) {
        this.unitRepresentation = unitRepresentation;
    }

    public Unit<Length> getUnitRepresentation() {
        return unitRepresentation;
    }
}