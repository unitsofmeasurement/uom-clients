package tec.uom.client.fitbit.model.activity;

import javax.measure.Quantity;
import javax.measure.quantity.Length;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class ActivityDistance {
    private String activity;
    private Quantity<Length> distance;

    public ActivityDistance(String activity, Quantity<Length> distance) {
        this.activity = activity;
        this.distance = distance;
    }

    public String getActivity() {
        return activity;
    }

    public Quantity<Length> getDistance() {
        return distance;
    }
}
