package tec.uom.client.fitbit.jackson.body;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
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
						SI.KILOGRAM), data.get("neck").asDouble(), data.get(
						"bicep").asDouble(), data.get("forearm").asDouble(),
				data.get("chest").asDouble(), data.get("waist").asDouble(),
				data.get("hips").asDouble(), data.get("thigh").asDouble(), data
						.get("calf").asDouble());
		return body;
	}
}
