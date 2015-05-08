package tec.uom.client.fitbit.model.device;

import hirondelle.date4j.DateTime;

import javax.measure.Quantity;
import javax.measure.quantity.Mass;
import javax.measure.quantity.Time;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class ScaleMeasurementLog {

    private final Long logId;
    private final Quantity<Mass> fat;
    private final Quantity<Mass> weight;
    private final DateTime date;
    private final Quantity<Time> time; // TODO is this a duration or time of day? (in that case, DateTime may handle both)
    private final String userId;
    private final String scaleUserName;

    public ScaleMeasurementLog(Long logId, Quantity<Mass> fat, Quantity<Mass> weight, DateTime date, Quantity<Time> time, String userId, String scaleUserName) {
        this.logId = logId;
        this.fat = fat;
        this.weight = weight;
        this.date = date;
        this.time = time;
        this.userId = userId;
        this.scaleUserName = scaleUserName;
    }

    public Long getLogId() {
        return logId;
    }

    public Quantity<Mass> getFat() {
        return fat;
    }

    public Quantity<Mass> getWeight() {
        return weight;
    }

    public DateTime getDate() {
        return date;
    }

    public Quantity<Time> getTime() {
        return time;
    }

    public String getUserId() {
        return userId;
    }

    public String getScaleUserName() {
        return scaleUserName;
    }
}
