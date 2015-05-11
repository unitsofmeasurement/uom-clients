package tec.uom.client.fitbit.jackson.heart;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

import tec.units.ri.quantity.Quantities;
import tec.uom.client.fitbit.model.heart.HeartLog;
import tec.uom.lib.domain.health.ri.Health;

/**
 * User: Werner
 * Date: 05/11/15
 */
public class HeartLogDeserializer extends JsonDeserializer<HeartLog> {

    @Override
    public HeartLog deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode data = jp.readValueAsTree();
        HeartLog log = new HeartLog(data.get("logId").asLong(),
                data.get("tracker").asText(),
                Quantities.getQuantity(data.get("heartRate").numberValue(), Health.BPM));

        // TODO adjust to Jackson Binding
        //if (jsonObject.has("time")) {
        //    this.time = jsonObject.getString("time");
        //} else {
        //    this.time = null;
        //}
              
        return log;
    }
}
