package tec.uom.client.fitbit.model.device;

import tec.uom.client.fitbit.model.user.UserInfo;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class ScaleUser {

    private String userId;
    private String scaleUserName;
    private BodyType bodyType;
    private UserInfo userInfo;

    public ScaleUser(String userId, String scaleUserName, BodyType bodyType,
			UserInfo userInfo) {
		super();
		this.userId = userId;
		this.scaleUserName = scaleUserName;
		this.bodyType = bodyType;
		this.userInfo = userInfo;
	}

	public String getUserId() {
        return userId;
    }

    public String getScaleUserName() {
        return scaleUserName;
    }

    public String getBodyType() {
        return bodyType.name();
    }

    public BodyType bodyType() {
        return bodyType;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }
}
