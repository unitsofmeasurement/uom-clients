package tec.uom.client.fitbit.model.sleep;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class Sleep {

    private SleepSummary summary;

    private List<SleepLog> sleepLogs;

    public Sleep() {
    }

    public Sleep(SleepSummary summary, List<SleepLog> sleepLogs) {
        this.summary = summary;
        this.sleepLogs = sleepLogs;
    }

    public SleepSummary getSummary() {
        return summary;
    }

    public void setSummary(SleepSummary summary) {
        this.summary = summary;
    }

    public List<SleepLog> getSleepLogs() {
        return sleepLogs;
    }

    public void setSleepLogs(List<SleepLog> sleepLogs) {
        this.sleepLogs = sleepLogs;
    }
}
