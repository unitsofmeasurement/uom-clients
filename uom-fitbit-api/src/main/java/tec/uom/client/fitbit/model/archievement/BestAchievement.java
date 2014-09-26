/*
 * Copyright 2014 Units of Measurement
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
package tec.uom.client.fitbit.model.archievement;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Length;

import tec.units.ri.util.TimedData;

import tec.uom.lib.domain.health.Floor;
import tec.uom.lib.domain.health.Step;

/**
 * Created by Jboss Studio. User: Werner Date: 08/24/14 Time: 18:20
 */
public class BestAchievement {

	private TimedData<Quantity<Energy>> caloriesOut;
	private TimedData<Quantity<Floor>> floors;
	private TimedData<Quantity<Length>> distance;
	private TimedData<Quantity<Step>> steps;

	public BestAchievement(TimedData<Quantity<Energy>> caloriesOut,
			TimedData<Quantity<Floor>> floors, TimedData<Quantity<Length>> distance,
			TimedData<Quantity<Step>> steps) {
		this.caloriesOut = caloriesOut;
		this.floors = floors;
		this.distance = distance;
		this.steps = steps;
	}

//	public BestAchievement(JSONObject jsonObject) throws JSONException {
//		if (jsonObject.has("caloriesOut")) {
//			this.caloriesOut = new BestAchievementItem(jsonObject
//					.getJSONObject("caloriesOut").getDouble("value"),
//					FitbitApiService.LOCAL_DATE_FORMATTER.parseDateTime(
//							jsonObject.getJSONObject("caloriesOut").getString(
//									"date")).toLocalDate());
//		}
//		if (jsonObject.has("floors")) {
//			this.floors = new BestAchievementItem(jsonObject.getJSONObject(
//					"floors").getDouble("value"),
//					FitbitApiService.LOCAL_DATE_FORMATTER.parseDateTime(
//							jsonObject.getJSONObject("floors")
//									.getString("date")).toLocalDate());
//		}
//		if (jsonObject.has("distance")) {
//			this.distance = new BestAchievementItem(jsonObject.getJSONObject(
//					"distance").getDouble("value"),
//					FitbitApiService.LOCAL_DATE_FORMATTER.parseDateTime(
//							jsonObject.getJSONObject("distance").getString(
//									"date")).toLocalDate());
//		}
//		if (jsonObject.has("steps")) {
//			this.steps = new BestAchievementItem(jsonObject.getJSONObject(
//					"steps").getDouble("value"),
//					FitbitApiService.LOCAL_DATE_FORMATTER
//							.parseDateTime(
//									jsonObject.getJSONObject("steps")
//											.getString("date")).toLocalDate());
//		}
//	}

	public TimedData<Quantity<Energy>> getCaloriesOut() {
		return caloriesOut;
	}

	public TimedData<Quantity<Floor>> getFloors() {
		return floors;
	}

	public TimedData<Quantity<Length>> getDistance() {
		return distance;
	}

	public TimedData<Quantity<Step>> getSteps() {
		return steps;
	}

}
