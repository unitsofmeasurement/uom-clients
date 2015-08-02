package tec.uom.client.fitbit.jackson.activity;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.unit.Units;
import tec.uom.client.fitbit.model.activity.ActivityLevel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar Parida 
 * Date: 6/11/15
 */

public class ActivityLevelDeserializer extends JsonDeserializer<ActivityLevel> {

	@Override
	public ActivityLevel deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		ActivityLevel activityLevel = new ActivityLevel(
				data.get("id").asLong(), data.get("name").asText(),
				Quantities.getQuantity(data.get("minSpeed").numberValue(),
						Units.METRES_PER_SECOND), Quantities.getQuantity(
						data.get("maxSpeed").numberValue(),
						Units.METRES_PER_SECOND));
		return activityLevel;
	}
}
