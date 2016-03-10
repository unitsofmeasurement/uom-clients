package tec.uom.client.fitbit.jackson.body;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.body.BodyGoals;
import tec.uom.client.fitbit.model.units.UnitSystem;
import tec.uom.client.fitbit.model.user.UserInfo;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar Parida 
 * Date: 5/22/15
 */
public class BodyGoalsDeserializer extends JsonDeserializer<BodyGoals> {

	@Override
	public BodyGoals deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = null;
		if (data.has("user")) {
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		BodyGoals bodyGoals = new BodyGoals(Quantities.getQuantity(
				data.get("weight").numberValue(),
				UnitSystem.getUnitSystem(userInfo.getLocale()).getWeightUnits()
						.getUnitRepresentation()), Quantities.getQuantity(data
				.get("fat").numberValue(),
				UnitSystem.getUnitSystem(userInfo.getLocale()).getWeightUnits()
						.getUnitRepresentation()));
		return bodyGoals;
	}
}
