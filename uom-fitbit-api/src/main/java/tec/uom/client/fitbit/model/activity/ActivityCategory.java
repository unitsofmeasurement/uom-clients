package tec.uom.client.fitbit.model.activity;

import java.util.List;

public class ActivityCategory {

    private int id;

    private String name;

    private List<ActivityCategory> subCategories;

    private List<DisplayableActivity> activities;

    public ActivityCategory(int id, String name,
			List<ActivityCategory> subCategories,
			List<DisplayableActivity> activities) {
		super();
		this.id = id;
		this.name = name;
		this.subCategories = subCategories;
		this.activities = activities;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public List<ActivityCategory> getSubCategories() {
        return subCategories;
    }

    public List<DisplayableActivity> getActivities() {
        return activities;
    }
}
