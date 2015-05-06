package tec.uom.client.fitbit.model.bp;

/**
 * User: Anakar Parida
 * Date: May 6, 2011
 * Time: 6:55:07 PM
 */
public class BpSummary {
    private final int systolic;
    private final int diastolic;
    private final String condition;

    public BpSummary(int systolic, int diastolic, String condition) {
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.condition = condition;
    }

    public int getSystolic() {
        return systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public String getCondition() {
        return condition;
    }
}
