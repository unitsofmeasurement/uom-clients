package tec.uom.client.fitbit.model.food;

import javax.measure.Quantity;
import javax.measure.quantity.Mass;


/**
 * User: Anakar Parida
 * Date: May 6, 2015
 * Time: 2:53:29 PM
 */
public class Serving {
    private int unitId;
    private Quantity<Mass> servingSize;
    private double multiplier;

    public Serving(int unitId, Quantity<Mass> servingSize, double multiplier) {
        this.unitId = unitId;
        this.servingSize = servingSize;
        this.multiplier = multiplier;
    }

    public int getUnitId() {
        return unitId;
    }

    public Quantity<Mass> getServingSize() {
        return servingSize;
    }

    public double getMultiplier() {
        return multiplier;
    }
}