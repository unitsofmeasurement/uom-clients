package tec.uom.client.fitbit.jackson.food;

import java.io.IOException;
import java.util.List;

import tec.uom.client.fitbit.jackson.deserializer.ListDeserializer;
import tec.uom.client.fitbit.model.food.Water;
import tec.uom.client.fitbit.model.food.WaterLog;
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
public class WaterDeserializer extends JsonDeserializer<Water> {

	@Override
	public Water deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		List<WaterLog> waterLogList = null;
		WaterLogSummary summary = null;
		if (data.has("water")) {
			ListDeserializer<WaterLog> listDeserializer = new ListDeserializer<WaterLog>();
			waterLogList = listDeserializer.deserialize(jp, ctxt);
		}
		if (data.has("summary")) {
			WaterLogSummaryDeserializer summaryDeserializer = new WaterLogSummaryDeserializer();
			summary = summaryDeserializer.deserialize(jp, ctxt);
		}
		Water water = new Water(waterLogList, summary);
		return water;
	}
}