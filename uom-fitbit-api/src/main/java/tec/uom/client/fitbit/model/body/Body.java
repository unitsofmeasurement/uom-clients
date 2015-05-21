package tec.uom.client.fitbit.model.body;

import javax.measure.Quantity;
import javax.measure.quantity.Mass;

public class Body {
    private Quantity<Mass> weight;
    private double bmi;
    private Quantity<Mass> fat;
    private double neck;
    private double bicep;
    private double forearm;
    private double chest;
    private double waist;
    private double hips;
    private double thigh;
    private double calf;

    public Body(Quantity<Mass> weight, double bmi, Quantity<Mass> fat, double neck, double bicep, double forearm, double chest, double waist, double hips, double thigh, double calf) {
        this.weight = weight;
        this.bmi = bmi;
        this.fat = fat;
        this.neck = neck;
        this.bicep = bicep;
        this.forearm = forearm;
        this.chest = chest;
        this.waist = waist;
        this.hips = hips;
        this.thigh = thigh;
        this.calf = calf;
    }

    public Quantity<Mass> getWeight() {
        return weight;
    }

    public double getBmi() {
        return bmi;
    }

    public Quantity<Mass> getFat() {
        return fat;
    }

    public double getNeck() {
        return neck;
    }

    public double getBicep() {
        return bicep;
    }

    public double getForearm() {
        return forearm;
    }

    public double getChest() {
        return chest;
    }

    public double getWaist() {
        return waist;
    }

    public double getHips() {
        return hips;
    }

    public double getThigh() {
        return thigh;
    }

    public double getCalf() {
        return calf;
    }
}
