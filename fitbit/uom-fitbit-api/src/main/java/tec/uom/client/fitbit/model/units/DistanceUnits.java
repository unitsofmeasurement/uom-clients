package tec.uom.client.fitbit.model.units;

import static systems.uom.common.USCustomary.MILE;

import javax.measure.Unit;
import javax.measure.quantity.Length;

import tech.units.indriya.unit.Units;
import javax.measure.MetricPrefix;

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