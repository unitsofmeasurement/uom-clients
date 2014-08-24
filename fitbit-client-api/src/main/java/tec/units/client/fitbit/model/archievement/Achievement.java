package tec.units.client.fitbit.model.archievement;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Length;

import tec.uom.lib.domain.health.Floor;
import tec.uom.lib.domain.health.Step;


/**
 * User: Werner
 * Date: 08/24/14
 * Time: 18:20
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
