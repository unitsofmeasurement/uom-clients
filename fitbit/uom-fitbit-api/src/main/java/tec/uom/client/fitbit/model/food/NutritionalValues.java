package tec.uom.client.fitbit.model.food;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Mass;

/**
 * User: Anakar Parida
 * Date: May 6, 2015
 * Time: 2:53:29 PM
 */
public class NutritionalValues {
    Quantity<Energy> calories;
    Quantity<Mass> fat;
    Quantity<Mass> fiber;
    Quantity<Mass> carbs;
    Quantity<Mass> sodium;
    Quantity<Mass> protein;

    public NutritionalValues(Quantity<Energy> calories, Quantity<Mass> fat, Quantity<Mass> fiber, Quantity<Mass> carbs, Quantity<Mass> sodium, Quantity<Mass> protein) {
        this.calories = calories;
        this.fat = fat;
        this.fiber = fiber;
        this.carbs = carbs;
        this.sodium = sodium;
        this.protein = protein;
    }


    public Quantity<Energy> getCalories() {
        return calories;
    }

    public Quantity<Mass> getFat() {
        return fat;
    }

    public Quantity<Mass> getFiber() {
        return fiber;
    }

    public Quantity<Mass> getCarbs() {
        return carbs;
    }

    public Quantity<Mass> getSodium() {
        return sodium;
    }

    public Quantity<Mass> getProtein() {
        return protein;
    }

}
