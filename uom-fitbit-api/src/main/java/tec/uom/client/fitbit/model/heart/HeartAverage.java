package tec.uom.client.fitbit.model.heart;

import javax.measure.Quantity;

import tec.uom.lib.domain.health.HeartRate;


/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 05/05/15
 * Time: 1:52 PM
 */
public class HeartAverage {

    private final String tracker;
    private final Quantity<HeartRate> heartRate;

    public HeartAverage(String tracker, Quantity<HeartRate> heartRate) {
        this.tracker = tracker;
        this.heartRate = heartRate;
    }

    public String getTracker() {
        return tracker;
    }

    public Quantity<HeartRate> getHeartRate() {
        return heartRate;
    }
}
