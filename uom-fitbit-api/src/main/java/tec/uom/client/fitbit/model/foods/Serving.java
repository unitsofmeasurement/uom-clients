package tec.uom.client.fitbit.model.foods;


/**
 * User: Anakar Parida
 * Date: May 6, 2015
 * Time: 2:53:29 PM
 */
public class Serving {
    private int unitId;
    private double servingSize;
    private double multiplier;

    public Serving(int unitId, double servingSize, double multiplier) {
        this.unitId = unitId;
        this.servingSize = servingSize;
        this.multiplier = multiplier;
    }

    public int getUnitId() {
        return unitId;
    }

    public double getServingSize() {
        return servingSize;
    }

    public double getMultiplier() {
        return multiplier;
    }
}