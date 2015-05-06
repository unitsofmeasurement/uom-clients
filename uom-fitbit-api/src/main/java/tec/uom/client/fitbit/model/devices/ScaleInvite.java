package tec.uom.client.fitbit.model.devices;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class ScaleInvite {

    private Long inviteId;
    private String email;
    private String scaleUserName;
    
    public ScaleInvite(Long inviteId, String email, String scaleUserName) {
		this.inviteId = inviteId;
		this.email = email;
		this.scaleUserName = scaleUserName;
	}

	public Long getInviteId() {
        return inviteId;
    }

    public String getEmail() {
        return email;
    }

    public String getScaleUserName() {
        return scaleUserName;
    }
}
