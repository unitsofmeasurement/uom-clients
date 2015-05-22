package tec.uom.client.fitbit.jackson.body;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.body.BodyGoals;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar Parida
 * Date: 5/22/15
 */
public class BodyGoalsDeserializer extends JsonDeserializer<BodyGoals> {

	@Override
	public BodyGoals deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		BodyGoals bodyGoals = new BodyGoals(Quantities.getQuantity(
				data.get("weight").numberValue(), SI.KILOGRAM),
				Quantities.getQuantity(data.get("fat").numberValue(),
						SI.KILOGRAM));
		return bodyGoals;
	}
}
