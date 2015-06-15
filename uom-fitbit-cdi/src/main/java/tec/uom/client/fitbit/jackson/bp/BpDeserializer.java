package tec.uom.client.fitbit.jackson.bp;

import java.io.IOException;
import java.util.List;

import tec.uom.client.fitbit.jackson.deserializer.ListDeserializer;
import tec.uom.client.fitbit.model.bp.Bp;
import tec.uom.client.fitbit.model.bp.BpLog;
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
public class BpDeserializer extends JsonDeserializer<Bp> {

	@Override
	public Bp deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		BpSummary average = null;
		List<BpLog> listBp = null;
		if (data.has("bp")) {
			ListDeserializer<BpLog> listDeserializer = new ListDeserializer<BpLog>();
			listBp = listDeserializer.deserialize(jp, ctxt);
		}
		if (data.has("average")) {
			BpSummaryDeserializer bpSummaryDeserializer = new BpSummaryDeserializer();
			average = bpSummaryDeserializer.deserialize(jp, ctxt);
		}
		Bp bp = new Bp(listBp, average);
		return bp;
	}
}