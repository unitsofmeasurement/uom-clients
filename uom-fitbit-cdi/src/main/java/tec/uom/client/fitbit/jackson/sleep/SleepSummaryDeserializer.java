package tec.uom.client.fitbit.jackson.sleep;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.sleep.SleepSummary;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 05/21/15
 */
public class SleepSummaryDeserializer extends JsonDeserializer<SleepSummary> {

	@Override
	public SleepSummary deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		SleepSummary sleepSummary = new SleepSummary(Quantities.getQuantity(
				data.get("totalSleepRecords").numberValue(), SI.HOUR),
				Quantities.getQuantity(data.get("totalMinutesAsleep")
						.numberValue(), SI.MINUTE), Quantities.getQuantity(data
						.get("totalTimeInBed").numberValue(), SI.HOUR));
		return sleepSummary;
	}

}
