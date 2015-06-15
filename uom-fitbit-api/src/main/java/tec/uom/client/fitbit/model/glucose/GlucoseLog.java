package tec.uom.client.fitbit.model.glucose;

import javax.measure.Quantity;
import javax.measure.quantity.Mass;
import javax.measure.quantity.Time;


/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class GlucoseLog {

	private final String tracker;
	private final Quantity<Mass> glucose;
	private final Quantity<Time> time;

	public GlucoseLog(String tracker, Quantity<Mass> glucose,
			Quantity<Time> time) {
		this.tracker = tracker;
		this.glucose = glucose;
		this.time = time;
	}

	public String getTracker() {
		return tracker;
	}

	public Quantity<Mass> getGlucose() {
		return glucose;
	}

	public Quantity<Time> getTime() {
		return time;
	}
}
