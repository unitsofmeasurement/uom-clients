package tec.uom.client.fitbit.model.body;

import javax.measure.Quantity;
import javax.measure.quantity.Mass;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class BodyGoals {

	private Quantity<Mass> weight;
    private Quantity<Mass> fat;

    public BodyGoals(Quantity<Mass> weight, Quantity<Mass> fat) {
        this.weight = weight;
        this.fat = fat;
    }
    
    public Quantity<Mass> getWeight() {
		return weight;
	}


	public Quantity<Mass> getFat() {
        return fat;
    }
}
