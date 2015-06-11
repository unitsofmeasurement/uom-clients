package tec.uom.client.fitbit.jackson.activity;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.activity.ActivityGoals;
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

public class ActivityGoalsDeserializer extends JsonDeserializer<ActivityGoals> {

	@Override
	public ActivityGoals deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		// TODO Uncomment when FLOOR and STEP are public in Health class.
		/*ActivityGoals activityGoals = new ActivityGoals(Quantities.getQuantity(
				data.get("caloriesOut").numberValue(), SI.JOULE),
				Quantities.getQuantity(data.get("steps").numberValue(),
						Health.STEP), Quantities.getQuantity(
						data.get("distance").numberValue(), SI.METRE),
				Quantities.getQuantity(data.get("activeMinutes").numberValue(),
						SI.MINUTE), Quantities.getQuantity(data.get("floors")
						.numberValue(), Health.FLOOR));
		return activityGoals;*/
		return null;
	}
}