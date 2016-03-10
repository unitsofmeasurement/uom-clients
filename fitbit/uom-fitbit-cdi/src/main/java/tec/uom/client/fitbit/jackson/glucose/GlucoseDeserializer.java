package tec.uom.client.fitbit.jackson.glucose;

import java.io.IOException;
import java.util.List;

import tec.uom.client.fitbit.jackson.deserializer.ListDeserializer;
import tec.uom.client.fitbit.model.glucose.Glucose;
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
public class GlucoseDeserializer extends JsonDeserializer<Glucose> {

	@Override
	public Glucose deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		List<GlucoseLog> glucoseLog = null;
		if (data.has("glucoseLog")) {
			ListDeserializer<GlucoseLog> deserializer = new ListDeserializer<GlucoseLog>();
			glucoseLog = deserializer.deserialize(jp, ctxt);
		}
		Glucose glucose = new Glucose(glucoseLog, data.get("hba1c").asDouble());
		return glucose;
	}
}