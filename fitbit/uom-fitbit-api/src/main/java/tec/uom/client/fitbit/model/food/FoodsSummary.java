package tec.uom.client.fitbit.model.food;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Mass;
import javax.measure.quantity.Volume;

/**
 * User: Anakar Parida 
 * Date: May 5, 2015
 */
public class FoodsSummary extends NutritionalValues {
	Quantity<Volume> water;

	public FoodsSummary(Quantity<Energy> calories, Quantity<Mass> fat,
			Quantity<Mass> fiber, Quantity<Mass> carbs, Quantity<Mass> sodium,
			Quantity<Mass> protein, Quantity<Volume> water) {
		super(calories, fat, fiber, carbs, sodium, protein);
		this.water = water;
	}

	public Quantity<Volume> getWater() {
		return water;
	}
}