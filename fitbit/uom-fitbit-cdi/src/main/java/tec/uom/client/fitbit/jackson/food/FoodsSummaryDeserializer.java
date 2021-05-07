package tec.uom.client.fitbit.jackson.food;

import java.io.IOException;

import tech.units.indriya.quantity.Quantities;
import tech.units.indriya.unit.Units;
import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.food.FoodsSummary;
import tec.uom.client.fitbit.model.units.UnitSystem;
import tec.uom.client.fitbit.model.user.UserInfo;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar Date: 06/15/15
 */

public class FoodsSummaryDeserializer extends JsonDeserializer<FoodsSummary> {

	@Override
	public FoodsSummary deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = null;
		if (data.has("user")) {
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		FoodsSummary foodsSummary = new FoodsSummary(Quantities.getQuantity(
				data.get("calories").numberValue(), Units.JOULE),
				Quantities.getQuantity(data.get("fat").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("fiber").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("carbs").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("sodium").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("protein").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("water").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getVolumeUnits().getUnitRepresentation()));
		return foodsSummary;
	}
}