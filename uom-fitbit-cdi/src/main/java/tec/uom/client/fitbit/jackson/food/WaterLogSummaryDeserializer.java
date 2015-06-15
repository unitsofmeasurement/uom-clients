package tec.uom.client.fitbit.jackson.food;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.food.WaterLogSummary;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class WaterLogSummaryDeserializer extends
		JsonDeserializer<WaterLogSummary> {

	@Override
	public WaterLogSummary deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		WaterLogSummary waterLogSummary = new WaterLogSummary(
				Quantities.getQuantity(data.get("water").numberValue(),
						SI.KILOGRAM));
		return waterLogSummary;
	}
}