package tec.uom.client.fitbit.model.units;

import javax.measure.Unit;
import javax.measure.quantity.Mass;

import tec.units.ri.spi.SI;
import tec.uom.se.util.UCUM;

public enum WeightUnits {
    KG(SI.KILOGRAM),
    POUNDS(UCUM.POUND),
    STONE(UCUM.STONE);

    Unit<Mass> unitRepresentation;

    WeightUnits(Unit<Mass> unitRepresentation) {
        this.unitRepresentation = unitRepresentation;
    }

    public Unit<Mass> getUnitRepresentation() {
        return unitRepresentation;
    }
}
