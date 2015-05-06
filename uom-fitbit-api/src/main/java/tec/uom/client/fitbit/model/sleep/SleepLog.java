package tec.uom.client.fitbit.model.sleep;

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
    Quantity<Time> startTime;
    boolean isMainSleep;
    Quantity<Time> duration;
    Quantity<Time> minutesToFallAsleep;
    Quantity<Time> minutesAsleep;
    Quantity<Time> minutesAwake;
    Quantity<Time> minutesAfterWakeup;
    Quantity<Time> awakeningsCount;
    Quantity<Time> timeInBed;
    int efficiency;

    public SleepLog(long logId, Quantity<Time> startTime, boolean mainSleep, Quantity<Time> duration, Quantity<Time> minutesToFallAsleep,
    		Quantity<Time> minutesAsleep, Quantity<Time> minutesAwake, Quantity<Time> minutesAfterWakeup, Quantity<Time> awakeningsCount, Quantity<Time> timeInBed,
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

    public Quantity<Time> getStartTime() {
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

    public Quantity<Time> getAwakeningsCount() {
        return awakeningsCount;
    }

    public Quantity<Time> getTimeInBed() {
        return timeInBed;
    }

    public int getEfficiency() {
        return efficiency;
    }
}
