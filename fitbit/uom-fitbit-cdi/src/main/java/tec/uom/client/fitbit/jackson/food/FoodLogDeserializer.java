package tec.uom.client.fitbit.jackson.food;

import hirondelle.date4j.DateTime;

import java.io.IOException;

import tec.uom.client.fitbit.model.food.FoodLog;
import tec.uom.client.fitbit.model.food.LoggedFood;
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
public class FoodLogDeserializer extends JsonDeserializer<FoodLog> {

	@Override
	public FoodLog deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		LoggedFood loggedFood = null;
		NutritionalValues nutritionalValues = null;
		if (data.has("loggedFood")) {
			LoggedFoodDeserializer loggedFoodDeserializer = new LoggedFoodDeserializer();
			loggedFood = loggedFoodDeserializer.deserialize(jp, ctxt);
		}
		if (data.has("nutritionalValues")) {
			NutritionalValuesDeserializer nutritionalValuesDeserializer = new NutritionalValuesDeserializer();
			nutritionalValues = nutritionalValuesDeserializer.deserialize(jp,
					ctxt);
		}
		FoodLog foodLog = new FoodLog(data.get("logId").asLong(), loggedFood,
				nutritionalValues, data.get("isFavorite").asBoolean(),
				new DateTime(data.get("logDate").asText()));
		return foodLog;
	}
}