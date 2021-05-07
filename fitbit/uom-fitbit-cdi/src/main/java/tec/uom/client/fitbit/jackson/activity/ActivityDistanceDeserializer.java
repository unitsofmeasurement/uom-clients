package tec.uom.client.fitbit.jackson.activity;

import java.io.IOException;

import tech.units.indriya.quantity.Quantities;
import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.activity.ActivityDistance;
import tec.uom.client.fitbit.model.units.UnitSystem;
import tec.uom.client.fitbit.model.user.UserInfo;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar Parida 
 * Date: 5/25/15
 */
public class ActivityDistanceDeserializer extends
		JsonDeserializer<ActivityDistance> {

	@Override
	public ActivityDistance deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = null;
		if (data.has("user")) {
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		ActivityDistance activityDistance = new ActivityDistance(data.get(
				"activity").asText(), Quantities.getQuantity(
				data.get("distance").numberValue(),
				UnitSystem.getUnitSystem(userInfo.getLocale())
						.getDistanceUnits().getUnitRepresentation())); // TODO
																		// this
																		// should
																		// be
																		// customizable
																		// (not
																		// just
																		// Metric)
		return activityDistance;
	}
}
