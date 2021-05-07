package tec.uom.client.fitbit.jackson.food;

import java.io.IOException;

import tech.units.indriya.quantity.Quantities;
import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.food.Serving;
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
public class ServingDeserializer extends JsonDeserializer<Serving> {

	@Override
	public Serving deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = null;
		if (data.has("user")) {
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		Serving serving = new Serving(data.get("unitId").asInt(),
				Quantities.getQuantity(data.get("servingSize").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				data.get("multiplier").asDouble());
		return serving;
	}
}