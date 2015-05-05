package tec.uom.client.fitbit.model.activity;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class Activities {

    private ActivitySummary summary;
    private List<ActivityLog> activities;
    private ActivityGoals activityGoals;

    public Activities(ActivitySummary summary, List<ActivityLog> activities, ActivityGoals activityGoals) {
        this.summary = summary;
        this.activities = activities;
        this.activityGoals = activityGoals;
    }

    public ActivitySummary getSummary() {
        return summary;
    }

    public List<ActivityLog> getActivities() {
        return activities;
    }

    public ActivityGoals getActivityGoals() {
        return activityGoals;
    }
}
