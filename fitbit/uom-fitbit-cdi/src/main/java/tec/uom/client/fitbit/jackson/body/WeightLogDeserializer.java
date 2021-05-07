package tec.uom.client.fitbit.jackson.body;

import hirondelle.date4j.DateTime;

import java.io.IOException;

import tech.units.indriya.quantity.Quantities;
import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.body.WeightLog;
import tec.uom.client.fitbit.model.units.UnitSystem;
import tec.uom.client.fitbit.model.user.UserInfo;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar Parida 
 * Date: 5/24/15
 */
public class WeightLogDeserializer extends JsonDeserializer<WeightLog> {

	@Override
	public WeightLog deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = null;
		if (data.has("user")) {
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		WeightLog weightLog = new WeightLog(data.get("logId").asLong(),
				Quantities.getQuantity(data.get("weight").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				data.get("bmi").asDouble(), new DateTime(data.get("date")
						.asText()), new DateTime(data.get("time").asText()));
		return weightLog;
	}
}
