package tec.uom.client.fitbit.jackson.glucose;

import java.io.IOException;

import tech.units.indriya.quantity.Quantities;
import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.glucose.GlucoseLog;
import tec.uom.client.fitbit.model.units.UnitSystem;
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
public class GlucoseLogDeserializer extends JsonDeserializer<GlucoseLog> {

	@Override
	public GlucoseLog deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = null;
		if (data.has("user")) {
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		GlucoseLog glucoseLog = new GlucoseLog(data.get("tracker").asText(),
				Quantities.getQuantity(data.get("glucose").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("time").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getDurationUnits().getUnitRepresentation()));
		return glucoseLog;
	}
}
