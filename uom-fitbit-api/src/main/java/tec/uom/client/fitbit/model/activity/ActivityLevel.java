package tec.uom.client.fitbit.model.activity;

import javax.measure.Quantity;
import javax.measure.quantity.Speed;

public class ActivityLevel extends DisplayableActivity{

	private Quantity<Speed> minSpeed;
    private Quantity<Speed> maxSpeed;
    private double mets;
    
    public ActivityLevel(long id, String name, Quantity<Speed> minSpeed, Quantity<Speed> maxSpeed) {
		super(id, name);
		this.minSpeed = minSpeed;
		this.maxSpeed = maxSpeed;
	}

    public Quantity<Speed> getMaxSpeed() {
        return maxSpeed;
    }

    public Quantity<Speed> getMinSpeed() {
        return minSpeed;
    }

    public double getMets() {
        return mets;
    }
}
