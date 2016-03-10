package tec.uom.client.fitbit.model.food;

import javax.measure.Quantity;
import javax.measure.quantity.Volume;

/**
 * User: Anakar Parida
 * Date: May 6, 2015
 * Time: 2:53:29 PM
 */
public class WaterLogSummary {

    private final Quantity<Volume> water;

    public WaterLogSummary(Quantity<Volume> water) {
        this.water = water;
    }

    public Quantity<Volume> getWater() {
        return water;
    }
}
