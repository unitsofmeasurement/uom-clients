package tec.uom.client.fitbit.model.body;

import javax.measure.Quantity;
import javax.measure.quantity.Mass;
import javax.measure.quantity.Time;

import org.joda.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class WeightLog {

    private long logId;
    private Quantity<Mass> weight;
    private double bmi;
    private LocalDate date;
    private Quantity<Time> time;

    public WeightLog(long logId, Quantity<Mass> weight, double bmi, LocalDate date, Quantity<Time> time) {
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

    public LocalDate getDate() {
        return date;
    }

    public Quantity<Time> getTime() {
        return time;
    }
}
