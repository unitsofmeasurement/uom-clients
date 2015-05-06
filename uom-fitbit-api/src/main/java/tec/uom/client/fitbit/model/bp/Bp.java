package tec.uom.client.fitbit.model.bp;

import java.util.List;

public class Bp {

    private final List<BpLog> bp;
    private final BpSummary average;

    public Bp(List<BpLog> bp, BpSummary average) {
        this.bp = bp;
        this.average = average;
    }

    public List<BpLog> getBp() {
        return bp;
    }

    public BpSummary getAverage() {
        return average;
    }
}