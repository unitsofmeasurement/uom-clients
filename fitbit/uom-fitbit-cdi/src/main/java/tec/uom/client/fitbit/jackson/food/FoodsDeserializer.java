package tec.uom.client.fitbit.jackson.food;

import java.io.IOException;
import java.util.List;

import tec.uom.client.fitbit.jackson.deserializer.ListDeserializer;
import tec.uom.client.fitbit.model.food.FoodLog;
import tec.uom.client.fitbit.model.food.Foods;
import tec.uom.client.fitbit.model.food.FoodsGoals;
import tec.uom.client.fitbit.model.food.FoodsSummary;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class FoodsDeserializer extends JsonDeserializer<Foods> {

	@Override
	public Foods deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		FoodsSummary summary = null;
		List<FoodLog> foodsList = null;
		FoodsGoals foodsGoals = null;
		if (data.has("summary")) {
			FoodsSummaryDeserializer foodSummaryDeserializer = new FoodsSummaryDeserializer();
			summary = foodSummaryDeserializer.deserialize(jp, ctxt);
		}
		if (data.has("foods")) {
			ListDeserializer<FoodLog> listDeserializer = new ListDeserializer<FoodLog>();
			foodsList = listDeserializer.deserialize(jp, ctxt);
		}
		if (data.has("foodsGoals")) {
			FoodsGoalsDeserializer foodsGoalsDeserializer = new FoodsGoalsDeserializer();
			foodsGoals = foodsGoalsDeserializer.deserialize(jp, ctxt);
		}
		Foods foods = new Foods(summary, foodsList, foodsGoals);
		return foods;
	}
}