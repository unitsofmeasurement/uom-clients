package tec.uom.client.fitbit.model.foods;

import java.util.List;

/**
 * User: Anakar Parida
 * Date: May 5, 2015
 * Time: 1:55:43 AM
 */
public class Foods {
    private FoodsSummary summary;
    private List<FoodLog> foods;
    private FoodsGoals foodsGoals;

    public Foods() {
    }

    public Foods(FoodsSummary summary, List<FoodLog> foods) {
        this.summary = summary;
        this.foods = foods;
    }

    public Foods(FoodsSummary summary, List<FoodLog> foods, FoodsGoals foodsGoals) {
        this.summary = summary;
        this.foods = foods;
        this.foodsGoals = foodsGoals;
    }

    public FoodsSummary getSummary() {
        return summary;
    }

    public List<FoodLog> getFoods() {
        return foods;
    }

    public FoodsGoals getFoodsGoals() {
        return foodsGoals;
    }
}