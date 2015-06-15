package tec.uom.client.fitbit.jackson.food;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.food.NutritionalValuesEntry;

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
		NutritionalValuesEntry nutritionalValuesEntry = new NutritionalValuesEntry(
				Quantities.getQuantity(data.get("calories").numberValue(),
						SI.JOULE), Quantities.getQuantity(
						data.get("caloriesFromFat").numberValue(), SI.JOULE),
				Quantities.getQuantity(data.get("totalFat").numberValue(),
						SI.KILOGRAM), Quantities.getQuantity(
						data.get("saturatedFat").numberValue(), SI.KILOGRAM),
				Quantities.getQuantity(data.get("transFat").numberValue(),
						SI.KILOGRAM), Quantities.getQuantity(
						data.get("cholesterol").numberValue(), SI.KILOGRAM),
				Quantities.getQuantity(data.get("sodium").numberValue(),
						SI.KILOGRAM), Quantities.getQuantity(
						data.get("totalCarbohydrate").numberValue(),
						SI.KILOGRAM), Quantities.getQuantity(
						data.get("dietaryFiber").numberValue(), SI.KILOGRAM),
				Quantities.getQuantity(data.get("sugars").numberValue(),
						SI.KILOGRAM), Quantities.getQuantity(data
						.get("protein").numberValue(), SI.KILOGRAM),
				Quantities.getQuantity(data.get("vitaminA").numberValue(),
						SI.KILOGRAM), Quantities.getQuantity(
						data.get("vitaminC").numberValue(), SI.KILOGRAM),
				Quantities.getQuantity(data.get("iron").numberValue(),
						SI.KILOGRAM), Quantities.getQuantity(data
						.get("calcium").numberValue(), SI.KILOGRAM),
				Quantities.getQuantity(data.get("potassium").numberValue(),
						SI.KILOGRAM), Quantities.getQuantity(data
						.get("thiamin").numberValue(), SI.KILOGRAM),
				Quantities.getQuantity(data.get("riboflavin").numberValue(),
						SI.KILOGRAM), Quantities.getQuantity(data.get("niacin")
						.numberValue(), SI.KILOGRAM), Quantities.getQuantity(
						data.get("vitaminD").numberValue(), SI.KILOGRAM),
				Quantities.getQuantity(data.get("vitaminE").numberValue(),
						SI.KILOGRAM), Quantities.getQuantity(
						data.get("vitaminB6").numberValue(), SI.KILOGRAM),
				Quantities.getQuantity(data.get("folicAcid").numberValue(),
						SI.KILOGRAM), Quantities.getQuantity(
						data.get("vitaminB12").numberValue(), SI.KILOGRAM),
				Quantities.getQuantity(data.get("phosphorus").numberValue(),
						SI.KILOGRAM), Quantities.getQuantity(data.get("iodine")
						.numberValue(), SI.KILOGRAM), Quantities.getQuantity(
						data.get("magnesium").numberValue(), SI.KILOGRAM),
				Quantities.getQuantity(data.get("zinc").numberValue(),
						SI.KILOGRAM), Quantities.getQuantity(data.get("copper")
						.numberValue(), SI.KILOGRAM), Quantities.getQuantity(
						data.get("biotin").numberValue(), SI.KILOGRAM),
				Quantities.getQuantity(data.get("pantothenicAcid")
						.numberValue(), SI.KILOGRAM));
		return nutritionalValuesEntry;
	}
}