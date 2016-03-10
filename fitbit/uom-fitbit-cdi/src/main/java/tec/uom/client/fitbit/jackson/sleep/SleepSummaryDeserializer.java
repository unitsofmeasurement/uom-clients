package tec.uom.client.fitbit.jackson.sleep;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.sleep.SleepSummary;
import tec.uom.client.fitbit.model.units.UnitSystem;
import tec.uom.client.fitbit.model.user.UserInfo;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 05/21/15
 */
public class SleepSummaryDeserializer extends JsonDeserializer<SleepSummary> {

	@Override
	public SleepSummary deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = null;
		if (data.has("user")) {
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		SleepSummary sleepSummary = new SleepSummary(Quantities.getQuantity(
				data.get("totalSleepRecords").numberValue(), UnitSystem
						.getUnitSystem(userInfo.getLocale()).getDurationUnits()
						.getUnitRepresentation()), Quantities.getQuantity(data
				.get("totalMinutesAsleep").numberValue(), UnitSystem
				.getUnitSystem(userInfo.getLocale()).getDurationUnits()
				.getUnitRepresentation()), Quantities.getQuantity(
				data.get("totalTimeInBed").numberValue(), UnitSystem
						.getUnitSystem(userInfo.getLocale()).getDurationUnits()
						.getUnitRepresentation()));
		return sleepSummary;
	}

}
