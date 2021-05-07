/*
 * Copyright 2016 Units of Measurement
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tec.uom.client.runkeeper.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import hirondelle.date4j.DateTime;

import java.io.IOException;

import tech.units.indriya.quantity.Quantities;
import tec.uom.client.runkeeper.model.HeartLog;
import tech.uom.domain.health.unit.Health;

/**
 * User: Werner
 * Date: 05/11/15
 */
public class HeartLogDeserializer extends JsonDeserializer<HeartLog> {

    @Override
    public HeartLog deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode data = jp.readValueAsTree();
        HeartLog log;

        // TODO adjust to Jackson Binding
        if (data.has("time")) {
//            this.time = ;
            log = new HeartLog(data.get("logId").asLong(),
                    data.get("tracker").asText(),
                    Quantities.getQuantity(data.get("heartRate").numberValue(), Health.BPM), 
                    new DateTime(data.get("time").asText()));
        } else {
//            this.time = null;
            log = new HeartLog(data.get("logId").asLong(),
                    data.get("tracker").asText(),
                    Quantities.getQuantity(data.get("heartRate").numberValue(), Health.BPM), null);
        }
        return log;
    }
}
