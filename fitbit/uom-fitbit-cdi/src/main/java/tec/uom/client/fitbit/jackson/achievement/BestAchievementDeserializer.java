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
package tec.uom.client.fitbit.jackson.achievement;

import java.io.IOException;

import tech.units.indriya.quantity.Quantities;
import tech.units.indriya.unit.Units;
import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.archievement.BestAchievement;
import tec.uom.client.fitbit.model.units.UnitSystem;
import tec.uom.client.fitbit.model.user.UserInfo;
import tech.uom.domain.health.Floor;
import tech.uom.domain.health.Step;
import tech.uom.domain.health.unit.Health;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 * User: Werner
 * Date: 02/13/16
 */

public class BestAchievementDeserializer extends
		JsonDeserializer<BestAchievement> {

	@Override
	public BestAchievement deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = null;
		if (data.has("user")) {
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		BestAchievement bestAchievement = new BestAchievement(
				Quantities.getQuantity(data.get("caloriesOut").numberValue(),
						Units.JOULE), Quantities.getQuantity(data.get("floors")
						.numberValue(),
						Health.getInstance().getUnit(Floor.class)),
				Quantities.getQuantity(data.get("distance").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getDistanceUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("steps").numberValue(), Health
						.getInstance().getUnit(Step.class)));
		return bestAchievement;
	}
}
