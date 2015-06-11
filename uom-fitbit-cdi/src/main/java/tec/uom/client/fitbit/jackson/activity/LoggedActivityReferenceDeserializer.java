package tec.uom.client.fitbit.jackson.activity;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.activity.ActivityGoals;
import tec.uom.client.fitbit.model.activity.LoggedActivityReference;
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

public class LoggedActivityReferenceDeserializer extends
		JsonDeserializer<LoggedActivityReference> {

	@Override
	public LoggedActivityReference deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		// TODO Uncomment when FLOOR and STEP are public in Health class.
		/*LoggedActivityReference logActivityReference = new LoggedActivityReference(
				Quantities.getQuantity(data.get("calories").numberValue(),
						SI.JOULE), Quantities.getQuantity(data.get("duration")
						.numberValue(), SI.MINUTE), Quantities.getQuantity(data
						.get("distance").numberValue(), SI.METRE),
				Quantities.getQuantity(data.get("steps").numberValue(),
						Health.STEP));
		return logActivityReference;*/
		return null;
	}
}