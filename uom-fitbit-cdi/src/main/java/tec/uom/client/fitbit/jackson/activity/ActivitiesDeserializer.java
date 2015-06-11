package tec.uom.client.fitbit.jackson.activity;

import java.io.IOException;
import java.util.List;

import tec.uom.client.fitbit.jackson.deserializer.ListDeserializer;
import tec.uom.client.fitbit.model.activity.Activities;
import tec.uom.client.fitbit.model.activity.ActivityGoals;
import tec.uom.client.fitbit.model.activity.ActivityLog;
import tec.uom.client.fitbit.model.activity.ActivitySummary;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 05/26/15
 */
public class ActivitiesDeserializer extends JsonDeserializer<Activities> {

	@Override
	public Activities deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		List<ActivityLog> activities = null;
		if (data.has("activities")) {
			ListDeserializer<ActivityLog> listDeserializer = new ListDeserializer<ActivityLog>();
			activities = listDeserializer.deserialize(jp, ctxt);
		}
		ActivitySummary summary = null;
		if (data.has("summary")) {
			ActivitySummaryDeserializer actSummaryDeserializer = new ActivitySummaryDeserializer();
			summary = actSummaryDeserializer.deserialize(jp, ctxt);
		}
		ActivityGoals activityGoals = null;
		if (data.has("activityGoals")) {
			ActivityGoalsDeserializer actGoalsDeserializer = new ActivityGoalsDeserializer();
			activityGoals = actGoalsDeserializer.deserialize(jp, ctxt);
		}
		Activities activity = new Activities(summary, activities, activityGoals);
		return activity;
	}
}
