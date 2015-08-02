package tec.uom.client.fitbit.model.units;

import javax.measure.Unit;
import javax.measure.quantity.Length;

import tec.units.ri.unit.Units;
import tec.units.ri.unit.MetricPrefix;
import systems.uom.common.US;

public enum HeightUnits {
    CM(MetricPrefix.CENTI(Units.METRE)),
    INCHES(US.INCH);

    Unit<Length> unitRepresentation;

    HeightUnits(Unit<Length> unitRepresentation) {
        this.unitRepresentation = unitRepresentation;
    }

    public Unit<Length> getUnitRepresentation() {
        return unitRepresentation;
    }
}