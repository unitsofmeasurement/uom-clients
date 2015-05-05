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
    private Double fat;

    public BodyGoals(Quantity<Mass> weight, Double fat) {
        this.weight = weight;
        this.fat = fat;
    }
    
    public Quantity<Mass> getWeight() {
		return weight;
	}


	public Double getFat() {
        return fat;
    }
}
