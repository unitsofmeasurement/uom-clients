package tec.uom.client.fitbit.model.food;

import java.util.UUID;

import javax.measure.Quantity;
import javax.measure.quantity.Mass;

/**
 * User: Anakar Parida
 * Date: Jan 02, 2011
 * Time: 11:55:47 AM
 */
public class FoodUnitEntry {
    private final Quantity<Mass> servingSize;
    private final UUID foodMeasurementUnitUuid;
    private final float multiplier;
    private final boolean defaultUnit;

    public FoodUnitEntry(Quantity<Mass> servingSize, UUID foodMeasurementUnitUuid, float multiplier, boolean defaultUnit) {
        this.servingSize = servingSize;
        this.foodMeasurementUnitUuid = foodMeasurementUnitUuid;
        this.multiplier = multiplier;
        this.defaultUnit = defaultUnit;
    }

    public Quantity<Mass> getServingSize() {
        return servingSize;
    }

    public String getFoodMeasurementUnitUuid() {
        return foodMeasurementUnitUuid.toString();
    }

    public UUID foodMeasurementUnitUuid() {
        return foodMeasurementUnitUuid;
    }

    public boolean isDefaultUnit() {
        return defaultUnit;
    }

    public float getMultiplier() {
        return multiplier;
    }
}
