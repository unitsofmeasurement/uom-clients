package tec.uom.client.fitbit.jackson.achievement;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.archievement.BestAchievement;
import tec.uom.domain.health.ri.Health;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */

public class BestAchievementDeserializer extends
		JsonDeserializer<BestAchievement> {

	@Override
	public BestAchievement deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		/*BestAchievement bestAchievement = new BestAchievement(
				Quantities.getQuantity(data.get("caloriesOut").numberValue(),
						SI.JOULE), Quantities.getQuantity(data.get("floors")
						.numberValue(), Health.FLOOR), Quantities.getQuantity(
						data.get("distance").numberValue(), SI.METRE),
				Quantities.getQuantity(data.get("steps").numberValue(),
						Health.STEP));
		return bestAchievement;*/
		return null;
	}
}
