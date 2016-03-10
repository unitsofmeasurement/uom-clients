package tec.uom.client.fitbit.jackson.food;

import java.io.IOException;
import java.util.List;

import tec.uom.client.fitbit.jackson.deserializer.ListDeserializer;
import tec.uom.client.fitbit.model.food.LoggedFood;
import tec.uom.client.fitbit.model.food.Meal;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class MealDeserializer extends JsonDeserializer<Meal> {

	@Override
	public Meal deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		List<LoggedFood> mealFoods = null;
		if (data.has("mealFoods")) {
			ListDeserializer<LoggedFood> listDeserializer = new ListDeserializer<LoggedFood>();
			mealFoods = listDeserializer.deserialize(jp, ctxt);
		}
		Meal meal = new Meal(data.get("id").asLong(),
				data.get("name").asText(), data.get("description").asText(),
				mealFoods);
		return meal;
	}
}