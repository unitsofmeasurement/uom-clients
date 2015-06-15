package tec.uom.client.fitbit.jackson.device;

import java.io.IOException;

import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.device.BodyType;
import tec.uom.client.fitbit.model.device.ScaleUser;
import tec.uom.client.fitbit.model.user.UserInfo;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class ScaleUserDeserializer extends JsonDeserializer<ScaleUser> {

	@Override
	public ScaleUser deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = null;
		if (data.has("userInfo")) {
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		ScaleUser scaleUser = new ScaleUser(data.get("userId").asText(), data
				.get("scaleUserName").asText(), BodyType.valueOf(data.get(
				"bodyType").asText()), userInfo);
		return scaleUser;
	}
}