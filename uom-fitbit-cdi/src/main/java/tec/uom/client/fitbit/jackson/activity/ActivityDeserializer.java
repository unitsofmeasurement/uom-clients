package tec.uom.client.fitbit.jackson.activity;

import java.io.IOException;
import java.util.List;

import tec.uom.client.fitbit.jackson.deserializer.ListDeserializer;
import tec.uom.client.fitbit.model.activity.Activity;
import tec.uom.client.fitbit.model.activity.ActivityLevel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 05/26/15
 */
public class ActivityDeserializer extends JsonDeserializer<Activity> {

	@Override
	public Activity deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		List<ActivityLevel> activityLevels = null;
		if (data.has("activityLevels")) {
			ListDeserializer<ActivityLevel> listDeserializer = new ListDeserializer<ActivityLevel>();
			activityLevels = listDeserializer.deserialize(jp, ctxt);
		}
		Activity activity = new Activity(data.get("id").asLong(), data.get("")
				.asText(), data.get("accessLevel").asText(), data.get(
				"hasSpeed").asBoolean(), data.get("mets").asDouble(),
				activityLevels);
		return activity;
	}
}
