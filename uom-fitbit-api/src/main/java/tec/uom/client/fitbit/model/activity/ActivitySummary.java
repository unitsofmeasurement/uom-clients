/*
 * Copyright 2015 Units of Measurement
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tec.uom.client.fitbit.model.activity;

import java.util.List;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Time;

import tec.uom.domain.health.Floor;
import tec.uom.domain.health.Step;

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
//		super();
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
