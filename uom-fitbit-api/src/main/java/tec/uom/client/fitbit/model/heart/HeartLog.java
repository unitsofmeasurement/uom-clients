package tec.uom.client.fitbit.model.heart;

import javax.measure.Quantity;

import tec.uom.lib.common.function.LongIdentifiable;
import tec.uom.lib.domain.health.HeartRate;


/**
 * User: Werner
 * Date: 09/25/14
 * Time: 18:20
 */
public class HeartLog implements LongIdentifiable{

    private final long logId;
    private final String tracker;
    private final Quantity<HeartRate> heartRate;
    private final String time;

    public HeartLog(long logId, String tracker, Quantity<HeartRate> heartRate, String time) {
        this.logId = logId;
        this.tracker = tracker;
        this.heartRate = heartRate;
        this.time = time;
    }

    public long getId() {
        return logId;
    }

    public String getTracker() {
        return tracker;
    }

    public Quantity<HeartRate> getHeartRate() {
        return heartRate;
    }

    public String getTime() {
        return time;
    }
}
