package tec.uom.client.fitbit.jackson.food;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.food.WaterLog;
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
public class WaterLogDeserializer extends JsonDeserializer<WaterLog> {

	@Override
	public WaterLog deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = null;
		if (data.has("user")) {
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		WaterLog waterLog = new WaterLog(data.get("logId").asLong(),
				Quantities.getQuantity(data.get("amount").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getVolumeUnits().getUnitRepresentation()));
		return waterLog;
	}
}