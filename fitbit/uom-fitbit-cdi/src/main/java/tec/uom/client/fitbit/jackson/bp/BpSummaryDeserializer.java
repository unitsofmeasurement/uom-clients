package tec.uom.client.fitbit.jackson.bp;

import java.io.IOException;

import tec.uom.client.fitbit.model.bp.BpSummary;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class BpSummaryDeserializer extends JsonDeserializer<BpSummary> {

	@Override
	public BpSummary deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		BpSummary bpSummary = new BpSummary(data.get("systolic").asInt(), data
				.get("diastolic").asInt(), data.get("condition").asText());
		return bpSummary;
	}
}
