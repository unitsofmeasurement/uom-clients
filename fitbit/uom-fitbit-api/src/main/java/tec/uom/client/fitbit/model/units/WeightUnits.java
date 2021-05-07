package tec.uom.client.fitbit.model.units;

import static tech.units.indriya.unit.Units.*;

import javax.measure.Unit;
import javax.measure.quantity.Mass;

import systems.uom.common.Imperial;
import systems.uom.common.USCustomary;

public enum WeightUnits {
    KG(KILOGRAM),
    POUNDS(USCustomary.POUND),
    STONE(Imperial.STONE);

    Unit<Mass> unitRepresentation;

    WeightUnits(Unit<Mass> unitRepresentation) {
        this.unitRepresentation = unitRepresentation;
    }

    public Unit<Mass> getUnitRepresentation() {
        return unitRepresentation;
    }
}
