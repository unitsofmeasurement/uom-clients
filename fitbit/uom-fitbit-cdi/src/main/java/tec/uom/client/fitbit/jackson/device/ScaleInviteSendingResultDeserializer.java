package tec.uom.client.fitbit.jackson.device;

import java.io.IOException;

import tec.uom.client.fitbit.model.device.ScaleInvite;
import tec.uom.client.fitbit.model.device.ScaleInviteSendingResult;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */

public class ScaleInviteSendingResultDeserializer extends
		JsonDeserializer<ScaleInviteSendingResult> {

	@Override
	public ScaleInviteSendingResult deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		ScaleInvite scaleInvite = null;
		if (data.has("scaleInvite")) {
			ScaleInviteDeserializer scaleInviteDeserializer = new ScaleInviteDeserializer();
			scaleInvite = scaleInviteDeserializer.deserialize(jp, ctxt);
		}
		ScaleInviteSendingResult scaleInviteSendingResult = new ScaleInviteSendingResult(
				data.get("success").asBoolean(), data.get("email").asText(),
				data.get("message").asText(), scaleInvite);
		return scaleInviteSendingResult;
	}
}
