package tec.uom.client.fitbit.model.foods;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Mass;

/**
 * User: Anakar Parida
 * Date: May 6, 2015
 * Time: 2:53:29 PM
 */
public class LoggedFood {
    private final long foodId;
    private final String name;
    private final String brand;
    private final String accessLevel;
    private final int[] units;
    private final Quantity<Energy> calories;
    private final Quantity<Mass> amount;
    private final byte mealTypeId;

    public LoggedFood(long foodId, String name, String brand, String accessLevel, Quantity<Energy> calories, Quantity<Mass> amount, byte mealTypeId, int[] units) {
        this.foodId = foodId;
        this.name = name;
        this.brand = brand;
        this.accessLevel = accessLevel;
        this.units = units;
        this.calories = calories;
        this.amount = amount;
        this.mealTypeId = mealTypeId;
    }

    public final Quantity<Energy> getCalories() {
        return calories;
    }

    public final Quantity<Mass> getAmount() {
        return amount;
    }

    public final byte getMealTypeId() {
        return mealTypeId;
    }

    public long getFoodId() {
        return foodId;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public int[] getUnits() {
        return units;
    }
}