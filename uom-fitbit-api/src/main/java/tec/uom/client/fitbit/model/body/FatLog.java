package tec.uom.client.fitbit.model.body;

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
public class FatLog {

    private final long logId;
    private final Quantity<Mass> fat;
    private final DateTime date;
    private final Quantity<Time> time; // TODO is this a duration or time of day? (in that case, DateTime may handle both)

    public FatLog(long logId, Quantity<Mass> fat, DateTime date, Quantity<Time> time) {
        this.logId = logId;
        this.fat = fat;
        this.date = date;
        this.time = time;
    }

    public long getLogId() {
        return logId;
    }

    public Quantity<Mass> getFat() {
        return fat;
    }

    public DateTime getDate() {
        return date;
    }

    public Quantity<Time> getTime() {
        return time;
    }
}