package tec.uom.client.fitbit.jackson.heart;

import java.io.IOException;
import java.util.List;

import tec.uom.client.fitbit.jackson.deserializer.ListDeserializer;
import tec.uom.client.fitbit.model.heart.Heart;
import tec.uom.client.fitbit.model.heart.HeartAverage;
import tec.uom.client.fitbit.model.heart.HeartLog;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class HeartDeserializer extends JsonDeserializer<Heart> {

	@Override
	public Heart deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		List<HeartLog> heartLog = null;
		List<HeartAverage> trackerAverage = null;
		if (data.has("heartLog")) {
			ListDeserializer<HeartLog> heartLogDeserializer = new ListDeserializer<HeartLog>();
			heartLog = heartLogDeserializer.deserialize(jp, ctxt);
		}
		if (data.has("trackerAverage")) {
			ListDeserializer<HeartAverage> trackerAverageDeserializer = new ListDeserializer<HeartAverage>();
			trackerAverage = trackerAverageDeserializer.deserialize(jp, ctxt);
		}
		Heart heart = new Heart(heartLog, trackerAverage);
		return heart;
	}
}