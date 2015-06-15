package tec.uom.client.fitbit.jackson.food;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.food.NutritionalValues;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class NutritionalValuesDeserializer extends
		JsonDeserializer<NutritionalValues> {

	@Override
	public NutritionalValues deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		NutritionalValues nutritionalValues = new NutritionalValues(
				Quantities.getQuantity(data.get("calories").numberValue(),
						SI.JOULE), Quantities.getQuantity(data.get("fat")
						.numberValue(), SI.KILOGRAM), Quantities.getQuantity(
						data.get("fiber").numberValue(), SI.KILOGRAM),
				Quantities.getQuantity(data.get("carbs").numberValue(),
						SI.KILOGRAM), Quantities.getQuantity(data.get("sodium")
						.numberValue(), SI.KILOGRAM), Quantities.getQuantity(
						data.get("protein").numberValue(), SI.KILOGRAM));
		return nutritionalValues;
	}
}