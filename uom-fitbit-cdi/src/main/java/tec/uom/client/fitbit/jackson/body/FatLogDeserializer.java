package tec.uom.client.fitbit.jackson.body;

import hirondelle.date4j.DateTime;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.body.FatLog;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar Parida
 * Date: 5/24/15
 */
public class FatLogDeserializer extends JsonDeserializer<FatLog> {

	@Override
	public FatLog deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		FatLog fatLog = new FatLog(data.get("logId").asLong(),
				Quantities.getQuantity(data.get("fat").numberValue(),
						SI.KILOGRAM), new DateTime(data.get("date").asText()),
				new DateTime(data.get("time").asText()));
		return fatLog;
	}
}