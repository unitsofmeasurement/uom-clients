package tec.uom.client.fitbit.jackson.heart;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.uom.client.fitbit.model.heart.HeartAverage;
import tec.uom.lib.domain.health.ri.Health;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 05/16/15
 */
public class HeartAverageDeserializer extends JsonDeserializer<HeartAverage> {

	@Override
	public HeartAverage deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		HeartAverage heartAvg = new HeartAverage(data.get("tracker").asText(),
				Quantities.getQuantity(data.get("heartRate").numberValue(),
						Health.BPM));
		return heartAvg;
	}

}
