package tec.uom.client.fitbit.jackson.activity;

import java.io.IOException;

import tec.uom.client.fitbit.model.activity.DisplayableActivity;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/11/15
 */

public class DisplayableActivityDeserializer extends
		JsonDeserializer<DisplayableActivity> {

	@Override
	public DisplayableActivity deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		DisplayableActivity displayableActivity = new DisplayableActivity(data
				.get("id").asLong(), data.get("name").asText());
		return displayableActivity;
	}
}
