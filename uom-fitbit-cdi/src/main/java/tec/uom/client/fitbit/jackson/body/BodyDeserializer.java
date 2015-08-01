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

package tec.uom.client.fitbit.jackson.body;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.body.Body;
import tec.uom.client.fitbit.model.units.UnitSystem;
import tec.uom.client.fitbit.model.user.UserInfo;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 05/21/15
 */
public class BodyDeserializer extends JsonDeserializer<Body> {

	@Override
	public Body deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = null;
		if (data.has("user")) {
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		Body body = new Body(Quantities.getQuantity(data.get("weight")
				.numberValue(), UnitSystem.getUnitSystem(userInfo.getLocale())
				.getWeightUnits().getUnitRepresentation()), data.get("bmi")
				.asDouble(), Quantities.getQuantity(data.get("fat")
				.numberValue(), UnitSystem.getUnitSystem(userInfo.getLocale())
				.getWeightUnits().getUnitRepresentation()), data.get("neck")
				.asDouble(), Quantities.getQuantity(data.get("bicep")
				.asDouble(), UnitSystem.getUnitSystem(userInfo.getLocale())
				.getMeasurementUnits().getUnitRepresentation()), data.get(
				"forearm").asDouble(), data.get("chest").asDouble(), data.get(
				"waist").asDouble(), data.get("hips").asDouble(), data.get(
				"thigh").asDouble(), data.get("calf").asDouble());
		return body;
	}
}
