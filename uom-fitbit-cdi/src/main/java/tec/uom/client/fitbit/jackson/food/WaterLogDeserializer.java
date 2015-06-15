package tec.uom.client.fitbit.jackson.food;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.food.WaterLog;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class WaterLogDeserializer extends JsonDeserializer<WaterLog> {

	@Override
	public WaterLog deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		WaterLog waterLog = new WaterLog(data.get("logId").asLong(),
				Quantities.getQuantity(data.get("amount").numberValue(),
						SI.KILOGRAM));
		return waterLog;
	}
}