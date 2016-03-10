package tec.uom.client.fitbit.model.bp;

import javax.measure.Quantity;
import javax.measure.quantity.Time;


/**
 * User: Anakar Parida
 * Date: May 6, 2011
 * Time: 6:55:07 PM
 */
public class BpLog {
    private final long logId;
    private final int systolic;
    private final int diastolic;
    private final Quantity<Time> time;

    public BpLog(long logId, int systolic, int diastolic, Quantity<Time> time) {
        this.logId = logId;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.time = time;
    }

    public long getLogId() {
        return logId;
    }

    public int getSystolic() {
        return systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public Quantity<Time> getTime() {
        return time;
    }
}
