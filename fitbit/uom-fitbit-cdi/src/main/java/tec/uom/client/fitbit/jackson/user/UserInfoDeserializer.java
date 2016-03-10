package tec.uom.client.fitbit.jackson.user;

import hirondelle.date4j.DateTime;

import java.io.IOException;
import java.util.Locale;

import tec.units.ri.quantity.Quantities;
import tec.uom.client.fitbit.model.units.DistanceUnits;
import tec.uom.client.fitbit.model.units.HeightUnits;
import tec.uom.client.fitbit.model.units.UnitSystem;
import tec.uom.client.fitbit.model.units.VolumeUnits;
import tec.uom.client.fitbit.model.units.WeightUnits;
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
						UnitSystem.getUnitSystem(Locale.getDefault())
								.getDistanceUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("weight").numberValue(),
						UnitSystem.getUnitSystem(Locale.getDefault())
								.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("strideLengthWalking")
						.numberValue(),
						UnitSystem.getUnitSystem(Locale.getDefault())
								.getDistanceUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("strideLengthRunning")
						.numberValue(),
						UnitSystem.getUnitSystem(Locale.getDefault())
								.getDistanceUnits().getUnitRepresentation()),
				data.get("fullName").asText(), data.get("nickname").asText(),
				data.get("country").asText(), data.get("state").asText(), data
						.get("city").asText(), data.get("aboutMe").asText(),
				new DateTime(data.get("memberSince").asText()), data.get(
						"offsetFromUTCMillis").asInt(), new Locale(data.get(
						"locale").asText()), data.get("avatar").asText(),
				WeightUnits.valueOf((data.get("weightUnit").asText()))
						.getUnitRepresentation(), DistanceUnits.valueOf(
						(data.get("distanceUnit").asText()))
						.getUnitRepresentation(), HeightUnits.valueOf(
						(data.get("heightUnit").asText()))
						.getUnitRepresentation(), VolumeUnits.valueOf(
						(data.get("waterUnit").asText()))
						.getUnitRepresentation(), VolumeUnits.valueOf(
						(data.get("glucoseUnit").asText()))
						.getUnitRepresentation());
		return userInfo;
	}
}