package tec.uom.client.fitbit.model.activity;

import java.util.List;

public class Activity extends DisplayableActivity {

	private  String accessLevel;
    private boolean hasSpeed;
    private Double mets;
    private List<ActivityLevel> activityLevels;
    
    public Activity(long id, String name, String accessLevel, boolean hasSpeed, Double mets, List<ActivityLevel> activityLevels) {
		super(id, name);
		this.accessLevel = accessLevel;
		this.hasSpeed = hasSpeed;
		this.mets = mets;
		this.activityLevels = activityLevels;//Added this variable to constructor for initialization.
	}

    public String getAccessLevel() {
        return accessLevel;
    }

    public boolean hasSpeed() {
        return hasSpeed;
    }

    public Double getMets() {
        return mets;
    }

    public List<ActivityLevel> getActivityLevels() {
        return activityLevels;
    }

    public boolean hasLevels() {
        return !activityLevels.isEmpty();
    }    
}
