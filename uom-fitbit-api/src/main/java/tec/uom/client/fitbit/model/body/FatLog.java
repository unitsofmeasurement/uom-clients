package tec.uom.client.fitbit.model.body;

import org.joda.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class FatLog {

    private long logId;
    private double fat;
    private LocalDate date;
    private String time;

    public FatLog(long logId, double fat, LocalDate date, String time) {
        this.logId = logId;
        this.fat = fat;
        this.date = date;
        this.time = time;
    }

    public long getLogId() {
        return logId;
    }

    public double getFat() {
        return fat;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
