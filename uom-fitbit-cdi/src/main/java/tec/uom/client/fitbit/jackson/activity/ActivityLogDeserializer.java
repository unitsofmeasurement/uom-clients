package tec.uom.client.fitbit.jackson.activity;

import hirondelle.date4j.DateTime;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.activity.ActivityLog;
import tec.uom.domain.health.ri.Health;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar Parida 
 * Date: 6/11/15
 */

public class ActivityLogDeserializer extends JsonDeserializer<ActivityLog> {

	@Override
	public ActivityLog deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		//TODO Uncomment when STEP is public in Health class. 
		/*ActivityLog activityLog = new ActivityLog(data.get("logId").asLong(),
				data.get("activityId").asLong(), data.get("name").asText(),
				data.get("description").asText(), data.get("activityParentId")
						.asLong(), data.get("activityParentName").asText(),
				new DateTime(data.get("startTime").asText()),
				Quantities.getQuantity(data.get("duration").numberValue(),
						SI.HOUR), Quantities.getQuantity(data.get("distance")
						.numberValue(), SI.METRE), Quantities.getQuantity(data
						.get("calories").numberValue(), SI.JOULE),
				Quantities.getQuantity(data.get("steps").numberValue(),
						Health.STEP), data.get("isFavorite").asBoolean());
		return activityLog;*/
		return null;
	}
}