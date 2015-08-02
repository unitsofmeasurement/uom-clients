package tec.uom.client.fitbit.jackson.activity;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.unit.Units;
import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.activity.ActivityReference;
import tec.uom.client.fitbit.model.activity.LoggedActivityReference;
import tec.uom.client.fitbit.model.units.UnitSystem;
import tec.uom.client.fitbit.model.user.UserInfo;
import tec.uom.domain.health.Step;
import tec.uom.domain.health.ri.Health;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/11/15
 */

public class LoggedActivityReferenceDeserializer extends
		JsonDeserializer<LoggedActivityReference> {

	@Override
	public LoggedActivityReference deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		ActivityReference activityReference = null;
		LoggedActivityReference logActivityReference = null;
		if (data.has("activityId")) {
			ActivityReferenceDeserializer activityReferenceDeserializer = new ActivityReferenceDeserializer();
			activityReference = activityReferenceDeserializer.deserialize(jp,
					ctxt);
			UserInfo userInfo = null;
			if (data.has("user")) {
				UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
				userInfo = userInfoDeserializer.deserialize(jp, ctxt);
			}
			logActivityReference = new LoggedActivityReference(
					activityReference.getActivityId(),
					activityReference.getName(),
					activityReference.getDescription(),
					activityReference.getActivityParentId(),
					activityReference.getActivityParentName(),
					Quantities.getQuantity(data.get("calories").numberValue(),
							Units.JOULE),
					Quantities
							.getQuantity(
									data.get("duration").numberValue(),
									UnitSystem
											.getUnitSystem(userInfo.getLocale())
											.getDurationUnits()
											.getUnitRepresentation()),
					Quantities
							.getQuantity(
									data.get("distance").numberValue(),
									UnitSystem
											.getUnitSystem(userInfo.getLocale())
											.getDistanceUnits()
											.getUnitRepresentation()),
					Quantities.getQuantity(data.get("steps").numberValue(),
							Health.getInstance().getUnit(Step.class)));
		}
		return logActivityReference;
	}
}