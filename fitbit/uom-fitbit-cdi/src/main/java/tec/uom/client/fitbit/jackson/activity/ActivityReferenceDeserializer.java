package tec.uom.client.fitbit.jackson.activity;

import java.io.IOException;

import tec.uom.client.fitbit.model.activity.ActivityReference;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/11/15
 */

public class ActivityReferenceDeserializer extends
		JsonDeserializer<ActivityReference> {

	@Override
	public ActivityReference deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		ActivityReference activityReference = new ActivityReference(data.get(
				"activityId").asLong(), data.get("name").asText(), data.get(
				"description").asText(), data.get("activityParentId").asLong(),
				data.get("activityParentName").asText());
		return activityReference;
	}
}