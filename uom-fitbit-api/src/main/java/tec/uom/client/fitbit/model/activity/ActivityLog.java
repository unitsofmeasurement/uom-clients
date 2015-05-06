package tec.uom.client.fitbit.model.activity;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Length;
import javax.measure.quantity.Time;

import tec.uom.lib.domain.health.Step;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class ActivityLog extends LoggedActivityReference {
    long logId;
    Quantity<Time> startTime;
    boolean hasStartTime;
    boolean isFavorite;

    public ActivityLog(long logId, long activityId, String name, String description, Long activityParentId, String activityParentName, Quantity<Time> startTime,
                       Quantity<Time> duration, Quantity<Length> distance, Quantity<Energy> calories, Quantity<Step> steps, boolean isFavorite) {
        super(activityId, name, description, activityParentId, activityParentName, calories, duration, distance, steps);
        this.logId = logId;
        this.startTime = startTime;
        this.hasStartTime = true;
        this.isFavorite = isFavorite;
    }

    public long getLogId() {
        return logId;
    }

    public Quantity<Time> getStartTime() {
        return startTime;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public boolean getHasStartTime() {
        return hasStartTime;
    }
}