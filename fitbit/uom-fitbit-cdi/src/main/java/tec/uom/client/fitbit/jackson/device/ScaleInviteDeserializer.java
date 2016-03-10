package tec.uom.client.fitbit.jackson.device;

import java.io.IOException;

import tec.uom.client.fitbit.model.device.ScaleInvite;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */

public class ScaleInviteDeserializer extends JsonDeserializer<ScaleInvite> {

	@Override
	public ScaleInvite deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		ScaleInvite scaleInvite = new ScaleInvite(
				data.get("inviteId").asLong(), data.get("email").asText(), data
						.get("scaleUserName").asText());
		return scaleInvite;
	}
}