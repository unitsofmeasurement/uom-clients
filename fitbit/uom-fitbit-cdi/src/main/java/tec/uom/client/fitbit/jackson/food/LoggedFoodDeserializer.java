package tec.uom.client.fitbit.jackson.food;

import java.io.IOException;

import tech.units.indriya.quantity.Quantities;
import tech.units.indriya.unit.Units;
import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.food.LoggedFood;
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
public class LoggedFoodDeserializer extends JsonDeserializer<LoggedFood> {

	@Override
	public LoggedFood deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = null;
		if (data.has("user")) {
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		LoggedFood loggedFood = new LoggedFood(data.get("foodId").asLong(),
				data.get("name").asText(), data.get("brand").asText(), data
						.get("accessLevel").asText(), Quantities.getQuantity(
						data.get("calories").numberValue(), Units.JOULE),
				Quantities.getQuantity(data.get("amount").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Byte.valueOf(data.get("mealTypeId").asText()), new int[data
						.get("units").asInt()]);
		return loggedFood;
	}
}