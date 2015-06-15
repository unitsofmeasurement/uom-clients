package tec.uom.client.fitbit.jackson.device;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.device.Scale;
import tec.uom.client.fitbit.model.device.ScaleVersion;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class ScaleDeserializer extends JsonDeserializer<Scale> {

	@Override
	public Scale deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		Scale scale = new Scale(data.get("id").asText(), data.get("name")
				.asText(), data.get("network").asText(), data.get("battery")
				.asText(), Quantities.getQuantity(data.get("lastSyncTime")
				.numberValue(), SI.MINUTE), Quantities.getQuantity(
				data.get("lastMeasurementTime").numberValue(), SI.MINUTE),
				Quantities.getQuantity(data.get("lastMeasurementTimeForMe")
						.numberValue(), SI.MINUTE), data.get("defaultUnit")
						.asText(), data.get("brightness").asInt(), data.get(
						"color").asText(), ScaleVersion.valueOf(data.get(
						"version").asText()), data.get("firmwareVersion")
						.asText());
		return scale;
	}
}