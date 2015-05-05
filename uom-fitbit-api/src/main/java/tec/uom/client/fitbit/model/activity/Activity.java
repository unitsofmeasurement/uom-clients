package tec.uom.client.fitbit.model.activity;

import java.util.List;

public class Activity extends DisplayableActivity {

	private  String accessLevel;
    private boolean hasSpeed;
    private Double mets;
    
    public Activity(long id, String name, String accessLevel, boolean hasSpeed, Double mets) {
		super(id, name);
		this.accessLevel = accessLevel;
		this.hasSpeed = hasSpeed;
		this.mets = mets;
	}

    private List<ActivityLevel> activityLevels;

    public String getAccessLevel() {
        return accessLevel;
    }

    public boolean getHasSpeed() {
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
