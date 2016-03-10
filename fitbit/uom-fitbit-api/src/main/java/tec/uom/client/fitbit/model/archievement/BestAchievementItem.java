package tec.uom.client.fitbit.model.archievement;

import hirondelle.date4j.DateTime;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class BestAchievementItem {

    private final Double value;
    private final DateTime date;

    public BestAchievementItem(Double value, DateTime date) {
        this.value = value;
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public DateTime getDate() {
        return date;
    }
}
