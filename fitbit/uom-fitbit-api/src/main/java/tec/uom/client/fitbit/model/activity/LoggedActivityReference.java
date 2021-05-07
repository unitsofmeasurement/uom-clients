package tec.uom.client.fitbit.model.activity;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Length;
import javax.measure.quantity.Time;

import tech.uom.domain.health.Step;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class LoggedActivityReference extends ActivityReference {
    Quantity<Energy> calories;
    Quantity<Time> duration;
    Quantity<Length> distance;
    Quantity<Step> steps;

    public LoggedActivityReference(long activityId, String name, String description, Long activityParentId, String activityParentName,
    		Quantity<Energy> calories, Quantity<Time> duration, Quantity<Length> distance, Quantity<Step> steps) {
        super(activityId, name, description, activityParentId, activityParentName);
        this.calories = calories;
        this.duration = duration;
        this.distance = distance;
        this.steps = steps;
    }

    /*private static List<LoggedActivityReference> jsonNodeToLoggedActivityReferenceList(JsonNode jsonNode) {
    	JsonNode dataNode = jsonNode.get("data");
        List<LoggedActivityReference> loggedActivityReferenceList = new ArrayList<LoggedActivityReference>();
        for (Iterator<JsonNode> iterator = dataNode.iterator(); iterator.hasNext(); ) {
            JSONObject jsonLoggedActivityReference = array.getJSONObject(i);
            loggedActivityReferenceList.add(new LoggedActivityReference((ObjectNode) iterator.next()));
        }
        return loggedActivityReferenceList;
    }*/

    public Quantity<Energy> getCalories() {
        return calories;
    }

    public Quantity<Time> getDuration() {
        return duration;
    }

    public Quantity<Length> getDistance() {
        return distance;
    }

    public Quantity<Step> getSteps() {
        return steps;
    }
}