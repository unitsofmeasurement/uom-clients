package tec.uom.client.fitbit.jackson.food;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.food.Serving;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class ServingDeserializer extends JsonDeserializer<Serving> {

	@Override
	public Serving deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		Serving serving = new Serving(data.get("unitId").asInt(),
				Quantities.getQuantity(data.get("servingSize").numberValue(),
						SI.KILOGRAM), data.get("multiplier").asDouble());
		return serving;
	}
}