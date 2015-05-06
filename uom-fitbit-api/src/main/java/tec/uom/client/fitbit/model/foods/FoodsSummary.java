package tec.uom.client.fitbit.model.foods;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Mass;



/**
 * User: Anakar Parida
 * Date: May 5, 2015
 * Time: 1:55:43 AM
 */
public class FoodsSummary extends NutritionalValues {
	Quantity<Mass> water;

    public FoodsSummary(Quantity<Energy> calories, Quantity<Mass> fat, Quantity<Mass> fiber, Quantity<Mass> carbs, Quantity<Mass> sodium, Quantity<Mass> protein, Quantity<Mass> water) {
        super(calories, fat, fiber, carbs, sodium, protein);
        this.water = water;
    }

    public Quantity<Mass> getWater() {
        return water;
    }
}