package tec.uom.client.fitbit.jackson.bp;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.bp.BpLog;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class BpLogDeserializer extends JsonDeserializer<BpLog> {

	@Override
	public BpLog deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		BpLog bpLog = new BpLog(data.get("logId").asLong(), data
				.get("systolic").asInt(), data.get("diastolic").asInt(),
				Quantities.getQuantity(data.get("time").numberValue(),
						SI.MINUTE));
		return bpLog;
	}
}
