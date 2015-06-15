package tec.uom.client.fitbit.jackson.user;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.units.ri.spi.SI;
import tec.uom.client.fitbit.model.user.FriendStats;
import tec.uom.client.fitbit.model.user.FriendStats.StatisticInfo;
import tec.uom.client.fitbit.model.user.UserInfo;
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
public class FriendStatsDeserializer extends JsonDeserializer<FriendStats> {

	@Override
	public FriendStats deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		UserInfo userInfo = null;
		StatisticInfo summary = null;
		StatisticInfo average = null;
		if(data.has("user")){
			UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer();
			userInfo = userInfoDeserializer.deserialize(jp, ctxt);
		}
		//TODO Uncomment when Health.STEP is visible
		/*if(data.has("summary")){
			summary = FriendStats.StatisticInfo(Quantities.getQuantity(data.get("summary").get("steps").numberValue(), Health.STEP),
					Quantities.getQuantity(data.get("summary").get("calories").numberValue(), SI.JOULE),
					Quantities.getQuantity(data.get("summary").get("distance").numberValue(), SI.METRE));
		}
		if(data.has("average")){
			average = FriendStats.StatisticInfo(Quantities.getQuantity(data.get("average").get("steps").numberValue(), Health.STEP),
					Quantities.getQuantity(data.get("average").get("calories").numberValue(), SI.JOULE),
					Quantities.getQuantity(data.get("average").get("distance").numberValue(), SI.METRE));
		}*/
		FriendStats friendStats = new FriendStats(userInfo, summary, average);
		return friendStats;
	}
}