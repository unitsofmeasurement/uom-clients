package tec.uom.client.fitbit.jackson.achievement;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.util.SI;
import tec.uom.client.fitbit.model.archievement.Achievement;
import tec.uom.lib.domain.health.ri.Health;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class AchievementDeserializer extends JsonDeserializer<Achievement> {

	@Override
	public Achievement deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		/*Achievement achievement = new Achievement(Quantities.getQuantity(data
				.get("caloriesOut").numberValue(), SI.JOULE),
				Quantities.getQuantity(data.get("floors").numberValue(),
						Health.FLOOR), Quantities.getQuantity(data.get("distance")
						.numberValue(), SI.METRE), Quantities.getQuantity(data
						.get("steps").numberValue(), Health.STEP));
		return achievement;*/
		return null;
	}
}
