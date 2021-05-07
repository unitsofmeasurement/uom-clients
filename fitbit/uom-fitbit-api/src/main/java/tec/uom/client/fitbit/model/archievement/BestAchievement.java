/*
 * Copyright 2014-2015 Units of Measurement
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

import tech.uom.domain.health.Floor;
import tech.uom.domain.health.Step;

/**
 * Created by Jboss Studio. 
 * User: Werner Date: 12/31/14 Time: 00:40
 */
public class BestAchievement {

	private Quantity<Energy> caloriesOut;
	private Quantity<Floor> floors;
	private Quantity<Length> distance;
	private Quantity<Step> steps;

	public BestAchievement(Quantity<Energy> caloriesOut,
			Quantity<Floor> floors, Quantity<Length> distance,
			Quantity<Step> steps) {
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