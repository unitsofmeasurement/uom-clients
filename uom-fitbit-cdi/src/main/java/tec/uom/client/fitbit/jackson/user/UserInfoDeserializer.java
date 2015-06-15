package tec.uom.client.fitbit.jackson.user;

import hirondelle.date4j.DateTime;

import java.io.IOException;
import java.util.Locale;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.user.Gender;
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
public class UserInfoDeserializer extends JsonDeserializer<UserInfo> {

	@Override
	public UserInfo deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = new UserInfo(data.get("encodedId").asText(), data
				.get("displayName").asText(), Gender.valueOf(data.get("gender")
				.asText()), new DateTime(data.get("dateOfBirth").asText()),
				Quantities.getQuantity(data.get("height").numberValue(),
						SI.METRE), Quantities.getQuantity(data.get("weight")
						.numberValue(), SI.KILOGRAM),
				Quantities.getQuantity(data.get("strideLengthWalking")
						.numberValue(), SI.METRE), Quantities.getQuantity(data
						.get("strideLengthRunning").numberValue(), SI.METRE),
				data.get("fullName").asText(), data.get("nickname").asText(),
				data.get("country").asText(), data.get("state").asText(), data
						.get("city").asText(), data.get("aboutMe").asText(),
				new DateTime(data.get("memberSince").asText()), data.get(
						"offsetFromUTCMillis").asInt(), new Locale(data.get(
						"locale").asText()), data.get("avatar").asText());
		return userInfo;
	}
}