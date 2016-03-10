package tec.uom.client.fitbit.jackson.body;

import java.io.IOException;

import tec.uom.client.fitbit.model.body.Body;
import tec.uom.client.fitbit.model.body.BodyGoals;
import tec.uom.client.fitbit.model.body.BodyWithGoals;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * User: Anakar 
 * Date: 06/15/15
 */
public class BodyWithGoalsDeserializer extends JsonDeserializer<BodyWithGoals> {

	@Override
	public BodyWithGoals deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode data = jp.readValueAsTree();
		Body body = null;
		BodyGoals bodyGoals = null;
		if (data.has("body")) {
			BodyDeserializer bodyDeserializer = new BodyDeserializer();
			body = bodyDeserializer.deserialize(jp, ctxt);
		}
		if (data.has("bodyGoals")) {
			BodyGoalsDeserializer bodyGoalsDeserializer = new BodyGoalsDeserializer();
			bodyGoals = bodyGoalsDeserializer.deserialize(jp, ctxt);
		}
		BodyWithGoals bodyWithGoals = new BodyWithGoals(body, bodyGoals);
		return bodyWithGoals;
	}
}