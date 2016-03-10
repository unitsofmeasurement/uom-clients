package tec.uom.client.fitbit.model.archievement;


/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class LifetimeAchievements {

    private Achievement tracker;
    private Achievement total;

    public LifetimeAchievements(Achievement tracker, Achievement total) {
        this.tracker = tracker;
        this.total = total;
    }

    public Achievement getTracker() {
        return tracker;
    }

    public Achievement getTotal() {
        return total;
    }
}