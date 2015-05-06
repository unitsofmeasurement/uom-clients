package tec.uom.client.fitbit.model.foods;

import java.util.List;

/**
 * User: Anakar Parida
 * Date: May 6, 2015
 * Time: 2:53:29 PM
 */
public class Meal {
    private final long id;
    private final String name;
    private final String description;
    private final List<LoggedFood> mealFoods;

    public Meal(long id, String name, String description, List<LoggedFood> mealFoods) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.mealFoods = mealFoods;
    }

    public final long getId() {
        return id;
    }

    public final String getName() {
        return name;
    }

    public final String getDescription() {
        return description;
    }

    public final List<LoggedFood> getMealFoods() {
        return mealFoods;
    }
}
