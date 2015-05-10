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
public class WeightLog {

    private final long logId;
    private final Quantity<Mass> weight;
    private final double bmi; // TODO could use Quantity here, too, see BMIDemo
    private final DateTime date;
    private final Quantity<Time> time; // TODO is this a duration or time of day? (in that case, DateTime may handle both)

    public WeightLog(long logId, Quantity<Mass> weight, double bmi, DateTime date, Quantity<Time> time) {
        this.logId = logId;
        this.weight = weight;
        this.bmi = bmi;
        this.date = date;
        this.time = time;
    }

    public long getLogId() {
        return logId;
    }

    public Quantity<Mass> getWeight() {
        return weight;
    }

    public double getBmi() {
        return bmi;
    }

    public DateTime getDate() {
        return date;
    }

    public Quantity<Time> getTime() {
        return time;
    }
}