package tec.uom.client.fitbit.jackson.glucose;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.glucose.GlucoseLog;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class GlucoseLogDeserializer extends JsonDeserializer<GlucoseLog> {

	@Override
	public GlucoseLog deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		GlucoseLog glucoseLog = new GlucoseLog(data.get("tracker").asText(),
				Quantities.getQuantity(data.get("glucose").numberValue(),
						SI.KILOGRAM), Quantities.getQuantity(data.get("time")
						.numberValue(), SI.MINUTE));
		return glucoseLog;
	}
}
