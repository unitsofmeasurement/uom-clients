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
import tec.units.ri.spi.SI;
import tec.units.ri.spi.SIPrefix;
import tec.uom.client.fitbit.model.body.Body;

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
		Body body = new Body(Quantities.getQuantity(data.get("weight")
				.numberValue(), SI.KILOGRAM), data.get("bmi").asDouble(),
				Quantities.getQuantity(data.get("fat").numberValue(),
						SI.KILOGRAM), data.get("neck").asDouble(), 
				Quantities.getQuantity(data.get("bicep").asDouble(), SIPrefix.CENTI(SI.METRE)), 
						data.get("forearm").asDouble(),
				data.get("chest").asDouble(), data.get("waist").asDouble(),
				data.get("hips").asDouble(), data.get("thigh").asDouble(), data
						.get("calf").asDouble());
		return body;
	}
}
