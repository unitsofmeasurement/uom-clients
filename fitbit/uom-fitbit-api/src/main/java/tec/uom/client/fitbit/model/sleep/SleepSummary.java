package tec.uom.client.fitbit.model.sleep;

import javax.measure.Quantity;
import javax.measure.quantity.Time;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class SleepSummary {

	Quantity<Time> totalSleepRecords = null;
	Quantity<Time> totalMinutesAsleep = null;
	Quantity<Time> totalTimeInBed = null;

    public SleepSummary() {
        this.totalSleepRecords = null;
        this.totalMinutesAsleep = null;
        this.totalTimeInBed = null;
    }

    public SleepSummary(Quantity<Time> totalSleepRecords, Quantity<Time> totalMinutesAsleep,
    		Quantity<Time> totalTimeInBed) {
		super();
		this.totalSleepRecords = totalSleepRecords;
		this.totalMinutesAsleep = totalMinutesAsleep;
		this.totalTimeInBed = totalTimeInBed;
	}

	public Quantity<Time> getTotalSleepRecords() {
        return totalSleepRecords;
    }

    public Quantity<Time> getTotalMinutesAsleep() {
        return totalMinutesAsleep;
    }

    public Quantity<Time> getTotalTimeInBed() {
        return totalTimeInBed;
    }
}
