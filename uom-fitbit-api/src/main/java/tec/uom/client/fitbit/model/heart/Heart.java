package tec.uom.client.fitbit.model.heart;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class Heart {

    private final List<HeartLog> heartLog;
    private final List<HeartAverage> trackerAverage;

    public Heart(List<HeartLog> heartLog, List<HeartAverage> trackerAverage) {
        this.heartLog = heartLog;
        this.trackerAverage = trackerAverage;
    }

    public List<HeartLog> getHeartLog() {
        return heartLog;
    }

    public List<HeartAverage> getTrackerAverage() {
        return trackerAverage;
    }
}