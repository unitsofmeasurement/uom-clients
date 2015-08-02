package tec.uom.client.fitbit.model.units;

import static systems.uom.common.US.MILE;

import javax.measure.Unit;
import javax.measure.quantity.Length;

import tec.units.ri.unit.Units;
import tec.units.ri.unit.MetricPrefix;

public enum DistanceUnits {
    METRIC(MetricPrefix.KILO(Units.METRE)),
    US(MILE);

    Unit<Length> unitRepresentation;

    DistanceUnits(Unit<Length> unitRepresentation) {
        this.unitRepresentation = unitRepresentation;
    }

    public Unit<Length> getUnitRepresentation() {
        return unitRepresentation;
    }

}