package tec.uom.client.fitbit.model.device;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class ScaleInviteSendingResult {

    private boolean success;
    private String email;
    private String message;
    private ScaleInvite scaleInvite;

    public ScaleInviteSendingResult(boolean success, String email,
			String message, ScaleInvite scaleInvite) {
		this.success = success;
		this.email = email;
		this.message = message;
		this.scaleInvite = scaleInvite;
	}

	public boolean getSuccess() {
        return success;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    public ScaleInvite getScaleInvite() {
        return scaleInvite;
    }
}
