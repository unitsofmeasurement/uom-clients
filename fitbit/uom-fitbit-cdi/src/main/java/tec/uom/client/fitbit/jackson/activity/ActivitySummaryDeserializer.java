/*
 * Copyright 2016 Units of Measurement
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
package tec.uom.client.fitbit.jackson.activity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.unit.Units;
import tec.uom.client.fitbit.jackson.deserializer.ListDeserializer;
import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.activity.ActivityDistance;
import tec.uom.client.fitbit.model.activity.ActivitySummary;
import tec.uom.client.fitbit.model.units.UnitSystem;
import tec.uom.client.fitbit.model.user.UserInfo;
import tec.uom.domain.health.Floor;
import tec.uom.domain.health.Step;
import tec.uom.domain.health.unit.Health;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/11/15
 * User: Werner
 * Date: 02/13/16
 */
public class ActivitySummaryDeserializer extends
		JsonDeserializer<ActivitySummary> {

	@Override
	public ActivitySummary deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		List<ActivityDistance> activityDistanceList = new ArrayList<ActivityDistance>();
		if (data.has("distances")) {
			ListDeserializer<ActivityDistance> listDeserializer = new ListDeserializer<ActivityDistance>();
			activityDistanceList = listDeserializer.deserialize(jp, ctxt);
		}
		UserInfo userInfo = null;
		if (data.has("user")) {
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		ActivitySummary activitySummary = new ActivitySummary(
				Quantities.getQuantity(data.get("caloriesOut").numberValue(),
						Units.JOULE), Quantities.getQuantity(
						data.get("activityCalories").numberValue(), Units.JOULE),
				Quantities.getQuantity(data.get("marginalCalories")
						.numberValue(), Units.JOULE), Quantities.getQuantity(data
						.get("steps").numberValue(), Health.getInstance()
						.getUnit(Step.class)), Quantities.getQuantity(
						data.get("floors").numberValue(), Health.getInstance()
								.getUnit(Floor.class)), data.get("elevation")
						.asDouble(), Quantities.getQuantity(
						data.get("sedentaryMinutes").numberValue(), UnitSystem
								.getUnitSystem(userInfo.getLocale())
								.getDurationUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("lightlyActiveMinutes")
						.numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getDurationUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("fairlyActiveMinutes")
						.numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getDurationUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("veryActiveMinutes")
						.numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getDurationUnits().getUnitRepresentation()),
				activityDistanceList);
		return activitySummary;
	}
}
