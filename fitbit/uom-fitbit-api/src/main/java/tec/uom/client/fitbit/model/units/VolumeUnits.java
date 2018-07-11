package tec.uom.client.fitbit.model.units;

import javax.measure.Unit;
import javax.measure.quantity.Volume;

import tec.units.ri.unit.Units;
import tec.units.ri.unit.MetricPrefix;
import systems.uom.common.USCustomary;

public enum VolumeUnits {
    ML(MetricPrefix.MILLI(Units.LITRE)),
    FL_OZ(USCustomary.FLUID_OUNCE),
    CUP(USCustomary.CUP);

    Unit<Volume> unitRepresentation;

    VolumeUnits(Unit<Volume> unitRepresentation) {
        this.unitRepresentation = unitRepresentation;
    }

    public Unit<Volume> getUnitRepresentation() {
        return unitRepresentation;
    }
}
