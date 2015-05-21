package tec.uom.client.fitbit.jackson.sleep;

import hirondelle.date4j.DateTime;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.sleep.SleepLog;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 05/21/15
 */
public class SleepLogDeserializer extends JsonDeserializer<SleepLog> {

	@Override
	public SleepLog deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		SleepLog sleepLog = new SleepLog(data.get("logId").asLong(),
				new DateTime(data.get("startTime").asText()), data.get(
						"isMainSleep").asBoolean(), Quantities.getQuantity(data
						.get("duration").numberValue(), SI.MINUTE),
				Quantities.getQuantity(data.get("minutesToFallAsleep")
						.numberValue(), SI.MINUTE), Quantities.getQuantity(data
						.get("minutesAsleep").numberValue(), SI.MINUTE),
				Quantities.getQuantity(data.get("minutesAwake").numberValue(),
						SI.MINUTE),
				Quantities.getQuantity(data.get("minutesAfterWakeup")
						.numberValue(), SI.MINUTE), data.get("awakeningsCount")
						.asInt(), Quantities.getQuantity(data.get("timeInBed")
						.numberValue(), SI.MINUTE), data.get("efficiency")
						.asInt());
		return sleepLog;
	}

}
