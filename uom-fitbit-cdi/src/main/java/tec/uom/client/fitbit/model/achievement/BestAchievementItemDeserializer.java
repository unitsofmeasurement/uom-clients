package tec.uom.client.fitbit.model.achievement;

import hirondelle.date4j.DateTime;

import java.io.IOException;

import tec.uom.client.fitbit.model.archievement.BestAchievementItem;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class BestAchievementItemDeserializer extends
		JsonDeserializer<BestAchievementItem> {

	@Override
	public BestAchievementItem deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		BestAchievementItem bestAchievementItem = new BestAchievementItem(data
				.get("value").asDouble(), new DateTime(data.get("date")
				.asText()));
		return bestAchievementItem;
	}
}
