package tec.uom.client.fitbit.jackson.activity;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.activity.ActivitySummary;
import tec.uom.domain.health.ri.Health;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/11/15
 */
public class ActivitySummaryDeserializer extends
		JsonDeserializer<ActivitySummary> {

	@Override
	public ActivitySummary deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		//TODO Uncomment when FLOOR and STEP are public in Health class. 
		/*ActivitySummary activitySummary = new ActivitySummary(
				Quantities.getQuantity(data.get("caloriesOut").numberValue(),
						SI.JOULE), Quantities.getQuantity(
						data.get("activityCalories").numberValue(), SI.JOULE),
				Quantities.getQuantity(data.get("marginalCalories")
						.numberValue(), SI.JOULE), Quantities.getQuantity(data
						.get("steps").numberValue(), Health.STEP),
				Quantities.getQuantity(data.get("floors").numberValue(),
						Health.FLOOR), data.get("elevation").asDouble(),
				Quantities.getQuantity(data.get("sedentaryMinutes")
						.numberValue(), SI.MINUTE), Quantities.getQuantity(data
						.get("lightlyActiveMinutes").numberValue(), SI.MINUTE),
				Quantities.getQuantity(data.get("fairlyActiveMinutes")
						.numberValue(), SI.MINUTE), Quantities.getQuantity(data
						.get("veryActiveMinutes").numberValue(), SI.MINUTE));
		return activitySummary;*/
		return null;
	}
}
