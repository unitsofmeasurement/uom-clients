package tec.uom.client.fitbit.model.units;

import javax.measure.Unit;
import javax.measure.quantity.Volume;

import tec.units.ri.spi.SI;
import tec.uom.se.util.SIPrefix;
import tec.uom.se.util.UCUM;

public enum VolumeUnits {
    ML(SIPrefix.MILLI(SI.LITRE)),
    FL_OZ(UCUM.FLUID_OUNCE_US),
    CUP(UCUM.CUP_US);

    Unit<Volume> unitRepresentation;

    VolumeUnits(Unit<Volume> unitRepresentation) {
        this.unitRepresentation = unitRepresentation;
    }

    public Unit<Volume> getUnitRepresentation() {
        return unitRepresentation;
    }
}
