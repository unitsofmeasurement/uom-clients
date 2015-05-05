package tec.uom.client.fitbit.model.archievement;


/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class BestAchievements {

    private BestAchievement tracker;
    private BestAchievement total;

    public BestAchievements(BestAchievement tracker, BestAchievement total) {
        this.tracker = tracker;
        this.total = total;
    }

    public BestAchievement getTracker() {
        return tracker;
    }

    public BestAchievement getTotal() {
        return total;
    }
}