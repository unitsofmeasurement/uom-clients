package tec.uom.client.fitbit.jackson.food;

import java.io.IOException;
import java.util.UUID;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.food.FoodUnitEntry;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class FoodUnitEntryDeserializer extends JsonDeserializer<FoodUnitEntry> {

	@Override
	public FoodUnitEntry deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		FoodUnitEntry foodUnitEntry = new FoodUnitEntry(Quantities.getQuantity(
				data.get("servingSize").numberValue(), SI.KILOGRAM),
				UUID.fromString(data.get("foodMeasurementUnitUuid").asText()),
				Float.parseFloat(data.get("multiplier").asText()), data.get(
						"defaultUnit").asBoolean());
		return foodUnitEntry;
	}
}
