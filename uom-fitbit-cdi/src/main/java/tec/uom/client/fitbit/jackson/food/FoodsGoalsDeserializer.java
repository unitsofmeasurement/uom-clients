package tec.uom.client.fitbit.jackson.food;

import java.io.IOException;

import tec.uom.client.fitbit.model.food.FoodsGoals;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class FoodsGoalsDeserializer extends JsonDeserializer<FoodsGoals> {

	@Override
	public FoodsGoals deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		FoodsGoals foodsGoals = new FoodsGoals(data.get("calories").asInt());
		return foodsGoals;
	}
}