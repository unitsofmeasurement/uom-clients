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

    private long logId;
    private Quantity<Mass> fat;
    private DateTime date;
    private Quantity<Time> time;

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
