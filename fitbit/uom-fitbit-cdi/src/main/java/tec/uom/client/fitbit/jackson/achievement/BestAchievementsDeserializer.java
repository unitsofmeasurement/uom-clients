package tec.uom.client.fitbit.jackson.achievement;

import java.io.IOException;

import tec.uom.client.fitbit.model.archievement.BestAchievement;
import tec.uom.client.fitbit.model.archievement.BestAchievements;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class BestAchievementsDeserializer extends
		JsonDeserializer<BestAchievements> {

	@Override
	public BestAchievements deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		BestAchievementDeserializer bestAchievementDeserializer = new BestAchievementDeserializer();
		BestAchievement trackerAchevement = null;
		BestAchievement totalAchevement = null;
		if (data.has("tracker")) {
			trackerAchevement = bestAchievementDeserializer.deserialize(jp,
					ctxt);
		}
		if (data.has("total")) {
			totalAchevement = bestAchievementDeserializer.deserialize(jp, ctxt);
		}
		BestAchievements bestAchievements = new BestAchievements(
				trackerAchevement, totalAchevement);
		return bestAchievements;
	}
}
