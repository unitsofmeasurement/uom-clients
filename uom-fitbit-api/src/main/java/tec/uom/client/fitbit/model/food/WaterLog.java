package tec.uom.client.fitbit.model.food;

import javax.measure.Quantity;
import javax.measure.quantity.Volume;

/**
 * User: Anakar Parida
 * Date: May 6, 2015
 * Time: 2:53:29 PM
 */
public class WaterLog {

    private final long logId;
    private final Quantity<Volume> amount;

    public WaterLog(long logId, Quantity<Volume> amount) {
        this.logId = logId;
        this.amount = amount;
    }

    public long getLogId() {
        return logId;
    }

    public Quantity<Volume> getAmount() {
        return amount;
    }
}
