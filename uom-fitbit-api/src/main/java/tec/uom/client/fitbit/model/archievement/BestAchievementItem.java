package tec.uom.client.fitbit.model.archievement;

import org.joda.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class BestAchievementItem {

    private Double value;
    private LocalDate date;

    public BestAchievementItem(Double value, LocalDate date) {
        this.value = value;
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }
}
