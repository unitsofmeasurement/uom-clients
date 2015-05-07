package tec.uom.client.fitbit.model.food;

import java.util.List;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Mass;
import tec.units.ri.function.Nameable;
/**
 * User: Anakar Parida
 * Date: May 6, 2015
 * Time: 2:53:29 PM
 */
public class Food implements Nameable {
    private final long foodId;
    private final String name;
    private final String brand;
    private final String accessLevel;
    private final Quantity<Energy> calories;
    private final Quantity<Mass> defaultServingSize;
    private final int[] units;
    private List<Serving> servings;
    private NutritionalValuesEntry nutritionalValues;

    public Food(long foodId, String name, String brand, String accessLevel, Quantity<Energy> calories, Quantity<Mass> defaultServingSize, int[] units) {
        this.foodId = foodId;
        this.name = name;
        this.brand = brand;
        this.accessLevel = accessLevel;
        this.calories = calories;
        this.defaultServingSize = defaultServingSize;
        this.units = units;
    }

    // TODO consider renaming getFoodId() to getId() using LongIdentifiable from uom-lib
    public final long getFoodId() {
        return foodId;
    }

    public final String getName() {
        return name;
    }

    public final String getBrand() {
        return brand;
    }

    public final int[] getUnits() {
        return units;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public Quantity<Energy> getCalories() {
        return calories;
    }

    public Quantity<Mass> getDefaultServingSize() {
        return defaultServingSize;
    }

    public List<Serving> getServings() {
        return servings;
    }

    public NutritionalValuesEntry getNutritionalValues() {
        return nutritionalValues;
    }

    public void setNutritionalValues(NutritionalValuesEntry nutritionalValues) {
        this.nutritionalValues = nutritionalValues;
    }
}
