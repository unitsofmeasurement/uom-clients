package tec.uom.client.fitbit.model.activity;

import java.util.List;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Time;

import tec.uom.lib.domain.health.Floor;
import tec.uom.lib.domain.health.Step;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class ActivitySummary {
    private Quantity<Energy> caloriesOut;
    private Quantity<Energy> activityCalories;
    private Quantity<Energy> marginalCalories;
    private Quantity<Step> steps;
    private Quantity<Floor> floors = null;
    private Double elevation = null;
    private Quantity<Time> sedentaryMinutes;
    private Quantity<Time> lightlyActiveMinutes;
    private Quantity<Time> fairlyActiveMinutes;
    private Quantity<Time> veryActiveMinutes;
    private List<ActivityDistance> distances;
    
    
	public ActivitySummary(Quantity<Energy> caloriesOut,
			Quantity<Energy> activityCalories,
			Quantity<Energy> marginalCalories, Quantity<Step> steps,
			Quantity<Floor> floors, Double elevation,
			Quantity<Time> sedentaryMinutes,
			Quantity<Time> lightlyActiveMinutes,
			Quantity<Time> fairlyActiveMinutes,
			Quantity<Time> veryActiveMinutes, List<ActivityDistance> distances) {
		super();
		this.caloriesOut = caloriesOut;
		this.activityCalories = activityCalories;
		this.marginalCalories = marginalCalories;
		this.steps = steps;
		this.floors = floors;
		this.elevation = elevation;
		this.sedentaryMinutes = sedentaryMinutes;
		this.lightlyActiveMinutes = lightlyActiveMinutes;
		this.fairlyActiveMinutes = fairlyActiveMinutes;
		this.veryActiveMinutes = veryActiveMinutes;
		this.distances = distances;
	}
	public Quantity<Energy> getCaloriesOut() {
		return caloriesOut;
	}
	public Quantity<Energy> getActivityCalories() {
		return activityCalories;
	}
	public Quantity<Energy> getMarginalCalories() {
		return marginalCalories;
	}
	public Quantity<Step> getSteps() {
		return steps;
	}
	public Quantity<Floor> getFloors() {
		return floors;
	}
	public Double getElevation() {
		return elevation;
	}
	public Quantity<Time> getSedentaryMinutes() {
		return sedentaryMinutes;
	}
	public Quantity<Time> getLightlyActiveMinutes() {
		return lightlyActiveMinutes;
	}
	public Quantity<Time> getFairlyActiveMinutes() {
		return fairlyActiveMinutes;
	}
	public Quantity<Time> getVeryActiveMinutes() {
		return veryActiveMinutes;
	}
	public List<ActivityDistance> getDistances() {
		return distances;
	}

}
