package tec.uom.client.fitbit.jackson.activity;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.activity.ActivityDistance;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar Parida 
 * Date: 5/25/15
 */
public class ActivityDistanceDeserializer extends
		JsonDeserializer<ActivityDistance> {

	@Override
	public ActivityDistance deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		ActivityDistance activityDistance = new ActivityDistance(data.get(
				"activity").asText(), Quantities.getQuantity(data.get("distance")
				.numberValue(), SI.METRE)); // TODO this should be customizable (not just Metric)
		return activityDistance;
	}
}
