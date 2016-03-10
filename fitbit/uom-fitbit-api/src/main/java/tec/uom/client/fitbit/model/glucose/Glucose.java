package tec.uom.client.fitbit.model.glucose;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class Glucose {

    private final List<GlucoseLog> glucoseLog;
    private final Double hba1c;

    public Glucose(List<GlucoseLog> glucoseLog, Double hba1c) {
        this.glucoseLog = glucoseLog;
        this.hba1c = hba1c;
    }

    public List<GlucoseLog> getGlucoseLog() {
        return glucoseLog;
    }

    public Double getHba1c() {
        return hba1c;
    }
}
