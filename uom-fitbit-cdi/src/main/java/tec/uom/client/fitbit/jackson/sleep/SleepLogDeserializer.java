package tec.uom.client.fitbit.jackson.sleep;

import hirondelle.date4j.DateTime;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.sleep.SleepLog;
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
public class SleepLogDeserializer extends JsonDeserializer<SleepLog> {

	@Override
	public SleepLog deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = null;
		if (data.has("user")) {
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		SleepLog sleepLog = new SleepLog(data.get("logId").asLong(),
				new DateTime(data.get("startTime").asText()), data.get(
						"isMainSleep").asBoolean(), Quantities.getQuantity(data
						.get("duration").numberValue(), UnitSystem
						.getUnitSystem(userInfo.getLocale()).getDurationUnits()
						.getUnitRepresentation()), Quantities.getQuantity(data
						.get("minutesToFallAsleep").numberValue(), UnitSystem
						.getUnitSystem(userInfo.getLocale()).getDurationUnits()
						.getUnitRepresentation()), Quantities.getQuantity(data
						.get("minutesAsleep").numberValue(), UnitSystem
						.getUnitSystem(userInfo.getLocale()).getDurationUnits()
						.getUnitRepresentation()), Quantities.getQuantity(data
						.get("minutesAwake").numberValue(), UnitSystem
						.getUnitSystem(userInfo.getLocale()).getDurationUnits()
						.getUnitRepresentation()), Quantities.getQuantity(data
						.get("minutesAfterWakeup").numberValue(), UnitSystem
						.getUnitSystem(userInfo.getLocale()).getDurationUnits()
						.getUnitRepresentation()), data.get("awakeningsCount")
						.asInt(), Quantities.getQuantity(data.get("timeInBed")
						.numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getDurationUnits().getUnitRepresentation()),
				data.get("efficiency").asInt());
		return sleepLog;
	}

}
