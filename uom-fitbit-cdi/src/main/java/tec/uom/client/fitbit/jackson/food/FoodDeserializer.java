package tec.uom.client.fitbit.jackson.food;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.food.Food;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class FoodDeserializer extends JsonDeserializer<Food> {

	@Override
	public Food deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		Food food = new Food(data.get("foodId").asLong(), data.get("name")
				.asText(), data.get("brand").asText(), data.get("accessLevel")
				.asText(), Quantities.getQuantity(data.get("calories")
				.numberValue(), SI.JOULE), Quantities.getQuantity(
				data.get("defaultServingSize").numberValue(), SI.KILOGRAM),
				new int[data.get("units").asInt()]);
		return food;
	}
}
