package tec.uom.client.fitbit.jackson.device;

import hirondelle.date4j.DateTime;

import java.io.IOException;

import tech.units.indriya.quantity.Quantities;
import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.device.ScaleMeasurementLog;
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
public class ScaleMeasurementLogDeserializer extends
		JsonDeserializer<ScaleMeasurementLog> {

	@Override
	public ScaleMeasurementLog deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = null;
		if (data.has("user")) {
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		ScaleMeasurementLog scaleMeasurementLog = new ScaleMeasurementLog(data
				.get("logId").asLong(), Quantities.getQuantity(data.get("fat")
				.numberValue(), UnitSystem.getUnitSystem(userInfo.getLocale())
				.getWeightUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("weight").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getWeightUnits().getUnitRepresentation()),
				new DateTime(data.get("date").asText()), new DateTime(data.get(
						"time").asText()), data.get("userId").asText(), data
						.get("scaleUserName").asText());
		return scaleMeasurementLog;
	}
}