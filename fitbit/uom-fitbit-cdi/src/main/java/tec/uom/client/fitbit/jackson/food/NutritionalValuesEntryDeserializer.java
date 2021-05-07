package tec.uom.client.fitbit.jackson.food;

import java.io.IOException;

import tech.units.indriya.quantity.Quantities;
import tech.units.indriya.unit.Units;
import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.food.NutritionalValuesEntry;
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
public class NutritionalValuesEntryDeserializer extends
		JsonDeserializer<NutritionalValuesEntry> {

	@Override
	public NutritionalValuesEntry deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = null;
		if (data.has("user")) {
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		NutritionalValuesEntry nutritionalValuesEntry = new NutritionalValuesEntry(
				Quantities.getQuantity(data.get("calories").numberValue(),
						Units.JOULE), Quantities.getQuantity(
						data.get("caloriesFromFat").numberValue(), Units.JOULE),
				Quantities.getQuantity(data.get("totalFat").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("saturatedFat").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("transFat").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("cholesterol").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("sodium").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("totalCarbohydrate")
						.numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("dietaryFiber").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("sugars").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("protein").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("vitaminA").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("vitaminC").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("iron").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("calcium").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("potassium").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("thiamin").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("riboflavin").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("niacin").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("vitaminD").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("vitaminE").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("vitaminB6").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("folicAcid").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("vitaminB12").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("phosphorus").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("iodine").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("magnesium").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("zinc").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("copper").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("biotin").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("pantothenicAcid")
						.numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()));
		return nutritionalValuesEntry;
	}
}