package tec.uom.client.fitbit.jackson.sleep;

import java.io.IOException;
import java.util.List;

import tec.uom.client.fitbit.jackson.deserializer.ListDeserializer;
import tec.uom.client.fitbit.model.sleep.Sleep;
import tec.uom.client.fitbit.model.sleep.SleepLog;
import tec.uom.client.fitbit.model.sleep.SleepSummary;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class SleepDeserializer extends JsonDeserializer<Sleep> {

	@Override
	public Sleep deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		SleepSummary summary = null;
		List<SleepLog> sleepLogs = null;
		if (data.has("summary")) {
			SleepSummaryDeserializer sleepSummaryDeserializer = new SleepSummaryDeserializer();
			summary = sleepSummaryDeserializer.deserialize(jp, ctxt);
		}
		if (data.has("sleepLogs")) {
			ListDeserializer<SleepLog> sleepLogDeserializer = new ListDeserializer<SleepLog>();
			sleepLogs = sleepLogDeserializer.deserialize(jp, ctxt);
		}
		Sleep sleep = new Sleep(summary, sleepLogs);
		return sleep;
	}
}