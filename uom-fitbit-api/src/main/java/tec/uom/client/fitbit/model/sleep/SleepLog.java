package tec.uom.client.fitbit.model.sleep;

import hirondelle.date4j.DateTime;

import javax.measure.Quantity;
import javax.measure.quantity.Time;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class SleepLog {
    long logId;
    DateTime startTime;
    boolean isMainSleep;
    Quantity<Time> duration;
    Quantity<Time> minutesToFallAsleep;
    Quantity<Time> minutesAsleep;
    Quantity<Time> minutesAwake;
    Quantity<Time> minutesAfterWakeup;
    int awakeningsCount;
    Quantity<Time> timeInBed;
    int efficiency;

    public SleepLog(long logId, DateTime startTime, boolean mainSleep, Quantity<Time> duration, Quantity<Time> minutesToFallAsleep,
    		Quantity<Time> minutesAsleep, Quantity<Time> minutesAwake, Quantity<Time> minutesAfterWakeup, int awakeningsCount, Quantity<Time> timeInBed,
                    int efficiency) {
        this.logId = logId;
        this.startTime = startTime;
        isMainSleep = mainSleep;
        this.duration = duration;
        this.minutesToFallAsleep = minutesToFallAsleep;
        this.minutesAsleep = minutesAsleep;
        this.minutesAwake = minutesAwake;
        this.minutesAfterWakeup = minutesAfterWakeup;
        this.awakeningsCount = awakeningsCount;
        this.timeInBed = timeInBed;
        this.efficiency = efficiency;
    }

    public long getLogId() {
        return logId;
    }

    public DateTime getStartTime() {
        return startTime;
    }

    public boolean isMainSleep() {
        return isMainSleep;
    }

    public Quantity<Time> getDuration() {
        return duration;
    }

    public Quantity<Time> getMinutesToFallAsleep() {
        return minutesToFallAsleep;
    }

    public Quantity<Time> getMinutesAsleep() {
        return minutesAsleep;
    }

    public Quantity<Time> getMinutesAwake() {
        return minutesAwake;
    }

    public Quantity<Time> getMinutesAfterWakeup() {
        return minutesAfterWakeup;
    }

    public int getAwakeningsCount() {
        return awakeningsCount;
    }

    public Quantity<Time> getTimeInBed() {
        return timeInBed;
    }

    public int getEfficiency() {
        return efficiency;
    }
}
