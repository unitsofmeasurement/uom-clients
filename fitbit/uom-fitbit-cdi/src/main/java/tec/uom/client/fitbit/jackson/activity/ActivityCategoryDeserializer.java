package tec.uom.client.fitbit.jackson.activity;

import java.io.IOException;
import java.util.List;

import tec.uom.client.fitbit.jackson.deserializer.ListDeserializer;
import tec.uom.client.fitbit.model.activity.ActivityCategory;
import tec.uom.client.fitbit.model.activity.DisplayableActivity;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar Parida
 * Date: 6/11/15
 */

public class ActivityCategoryDeserializer extends
		JsonDeserializer<ActivityCategory> {

	@Override
	public ActivityCategory deserialize(JsonParser jp,
			DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		List<ActivityCategory> activityCategoryList = null;
		List<DisplayableActivity> displayableActivityList = null;
		if (data.has("subCategories")) {
			ListDeserializer<ActivityCategory> listDeserializer = new ListDeserializer<ActivityCategory>();
			activityCategoryList = listDeserializer.deserialize(jp, ctxt);
		}
		if (data.has("activities")) {
			ListDeserializer<DisplayableActivity> listDeserializer = new ListDeserializer<DisplayableActivity>();
			displayableActivityList = listDeserializer.deserialize(jp, ctxt);
		}
		ActivityCategory activityCategory = new ActivityCategory(data.get("id")
				.asInt(), data.get("name").asText(), activityCategoryList,
				displayableActivityList);
		return activityCategory;
	}
}
