package tec.uom.client.fitbit.model.body;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class BodyWithGoals {

    private Body body;
    private BodyGoals bodyGoals;

    public BodyWithGoals(Body body, BodyGoals bodyGoals) {
        this.body = body;
        this.bodyGoals = bodyGoals;
    }

    public Body getBody() {
        return body;
    }

    public BodyGoals getBodyGoals() {
        return bodyGoals;
    }
}
