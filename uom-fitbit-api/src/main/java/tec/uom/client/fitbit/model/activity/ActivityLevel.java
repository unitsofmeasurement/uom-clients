package tec.uom.client.fitbit.model.activity;

import javax.measure.Quantity;
import javax.measure.quantity.Speed;

public class ActivityLevel extends DisplayableActivity{

	private Quantity<Speed> minSpeedMPH;
    private Quantity<Speed> maxSpeedMPH;
    private double mets;
    
    public ActivityLevel(long id, String name, Quantity<Speed> minSpeedMPH, Quantity<Speed> maxSpeedMPH) {
		super(id, name);
		this.minSpeedMPH = minSpeedMPH;
		this.maxSpeedMPH = maxSpeedMPH;
	}

    public Quantity<Speed> getMaxSpeedMPH() {
        return maxSpeedMPH;
    }

    public Quantity<Speed> getMinSpeedMPH() {
        return minSpeedMPH;
    }

    public double getMets() {
        return mets;
    }
}
