package tec.uom.client.fitbit.model.food;

import javax.measure.Quantity;
import javax.measure.quantity.Mass;

/**
 * User: Anakar Parida
 * Date: May 6, 2015
 * Time: 2:53:29 PM
 */
public class WaterLog {

    private final long logId;
    private final Quantity<Mass> amount;

    public WaterLog(long logId, Quantity<Mass> amount) {
        this.logId = logId;
        this.amount = amount;
    }

    public long getLogId() {
        return logId;
    }

    public Quantity<Mass> getAmount() {
        return amount;
    }
}
