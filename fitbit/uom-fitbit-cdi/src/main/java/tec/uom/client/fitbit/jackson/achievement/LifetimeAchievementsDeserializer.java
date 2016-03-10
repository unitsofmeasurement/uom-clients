package tec.uom.client.fitbit.jackson.achievement;

import java.io.IOException;

import tec.uom.client.fitbit.model.archievement.Achievement;
import tec.uom.client.fitbit.model.archievement.LifetimeAchievements;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class LifetimeAchievementsDeserializer extends
		JsonDeserializer<LifetimeAchievements> {

	@Override
	public LifetimeAchievements deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		AchievementDeserializer achievementDeserializer = new AchievementDeserializer();
		Achievement trackerAchevement = null;
		Achievement totalAchevement = null;
		if (data.has("tracker")) {
			trackerAchevement = achievementDeserializer.deserialize(jp, ctxt);
		}
		if (data.has("total")) {
			totalAchevement = achievementDeserializer.deserialize(jp, ctxt);
		}
		LifetimeAchievements lifetimeAchievements = new LifetimeAchievements(
				trackerAchevement, totalAchevement);
		return lifetimeAchievements;
	}
}