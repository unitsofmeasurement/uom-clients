package org.unitsofmeasurement.client.fitbit.model.archievement;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Length;

import org.unitsofmeasurement.domain.health.Floor;
import org.unitsofmeasurement.domain.health.Step;

/**
 * Created by IntelliJ IDEA.
 * User: Werner
 * Date: 10/18/11
 * Time: 12:56 AM
 */
public class Achievement {

    private Quantity<Energy> caloriesOut;
    private Quantity<Floor> floors;
    private Quantity<Length> distance;
    private Quantity<Step> steps;

    public Achievement(Quantity<Energy> caloriesOut, Quantity<Floor> floors, Quantity<Length> distance, Quantity<Step> steps) {
        this.caloriesOut = caloriesOut;
        this.floors = floors;
        this.distance = distance;
        this.steps = steps;
    }

    public Quantity<Energy> getCaloriesOut() {
        return caloriesOut;
    }

    public Quantity<Floor> getFloors() {
        return floors;
    }

    public Quantity<Length> getDistance() {
        return distance;
    }

    public Quantity<Step> getSteps() {
        return steps;
    }

}
