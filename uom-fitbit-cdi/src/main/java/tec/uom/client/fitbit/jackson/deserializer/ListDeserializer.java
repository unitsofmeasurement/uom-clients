package tec.uom.client.fitbit.jackson.deserializer;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.agorava.api.atinject.BeanResolver;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

// TODO where is this used? since package local -> Changed the access level to be used in other package
public class ListDeserializer<T> extends JsonDeserializer<List<T>> {

	@Override
	public List<T> deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		ObjectMapper mapper = BeanResolver.getInstance().resolve(ObjectMapper.class);
        jp.setCodec(mapper);
        if (jp.hasCurrentToken()) {
            JsonNode dataNode = (JsonNode) jp.readValueAs(JsonNode.class).get("data");
            if (dataNode != null) {
                return (List<T>) mapper.reader(new TypeReference<List<T>>() {
                }).readValue((JsonNode)dataNode);
            }
        }

        return Collections.emptyList();
	}
	
}
