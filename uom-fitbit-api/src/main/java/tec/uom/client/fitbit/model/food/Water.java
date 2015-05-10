package tec.uom.client.fitbit.model.food;

import java.util.List;

/**
 * User: Anakar Parida
 * Date: May 6, 2015
 * Time: 2:53:29 PM
 */
public class Water {

    private final List<WaterLog> water;
    private final WaterLogSummary summary;

    public Water(List<WaterLog> water, WaterLogSummary summary) {
        this.water = water;
        this.summary = summary;
    }

    public List<WaterLog> getWater() {
        return water;
    }

    public WaterLogSummary getSummary() {
        return summary;
    }
}