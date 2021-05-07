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

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Length;
import javax.measure.quantity.Time;

import tech.uom.domain.health.Floor;
import tech.uom.domain.health.Step;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class ActivityGoals {

	private Quantity<Energy> caloriesOut;
	private Quantity<Step> steps;
	private Quantity<Length> distance;
	private Quantity<Time> activeMinutes;
	private Quantity<Floor> floors;

	public ActivityGoals() {
	}

	public ActivityGoals(Quantity<Energy> caloriesOut, Quantity<Step> steps,
			Quantity<Length> distance, Quantity<Time> activeMinutes,
			Quantity<Floor> floors) {
		super();
		this.caloriesOut = caloriesOut;
		this.steps = steps;
		this.distance = distance;
		this.activeMinutes = activeMinutes;
		this.floors = floors;
	}

	public Quantity<Energy> getCaloriesOut() {
		return caloriesOut;
	}

	public Quantity<Step> getSteps() {
		return steps;
	}

	public Quantity<Length> getDistance() {
		return distance;
	}

	public Quantity<Time> getActiveMinutes() {
		return activeMinutes;
	}

	public Quantity<Floor> getFloors() {
		return floors;
	}

	public boolean hasAnyValue() {
		return caloriesOut != null || steps != null || distance != null
				|| activeMinutes != null || floors != null;
	}
}
