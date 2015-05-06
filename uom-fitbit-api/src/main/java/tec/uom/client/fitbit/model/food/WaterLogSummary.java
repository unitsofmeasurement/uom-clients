package tec.uom.client.fitbit.model.food;

import javax.measure.Quantity;
import javax.measure.quantity.Mass;

/**
 * User: Anakar Parida
 * Date: May 6, 2015
 * Time: 2:53:29 PM
 */
public class WaterLogSummary {

    private final Quantity<Mass> water;

    public WaterLogSummary(Quantity<Mass> water) {
        this.water = water;
    }

    public Quantity<Mass> getWater() {
        return water;
    }
}
