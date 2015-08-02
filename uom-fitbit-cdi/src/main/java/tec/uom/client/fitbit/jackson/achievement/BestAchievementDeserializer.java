package tec.uom.client.fitbit.jackson.achievement;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.unit.Units;
import tec.uom.client.fitbit.jackson.user.UserInfoDeserializer;
import tec.uom.client.fitbit.model.archievement.BestAchievement;
import tec.uom.client.fitbit.model.units.UnitSystem;
import tec.uom.client.fitbit.model.user.UserInfo;
import tec.uom.domain.health.Floor;
import tec.uom.domain.health.Step;
import tec.uom.domain.health.ri.Health;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */

public class BestAchievementDeserializer extends
		JsonDeserializer<BestAchievement> {

	@Override
	public BestAchievement deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = null;
		if (data.has("user")) {
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		BestAchievement bestAchievement = new BestAchievement(
				Quantities.getQuantity(data.get("caloriesOut").numberValue(),
						Units.JOULE), Quantities.getQuantity(data.get("floors")
						.numberValue(),
						Health.getInstance().getUnit(Floor.class)),
				Quantities.getQuantity(data.get("distance").numberValue(),
						UnitSystem.getUnitSystem(userInfo.getLocale())
								.getDistanceUnits().getUnitRepresentation()),
				Quantities.getQuantity(data.get("steps").numberValue(), Health
						.getInstance().getUnit(Step.class)));
		return bestAchievement;
	}
}
