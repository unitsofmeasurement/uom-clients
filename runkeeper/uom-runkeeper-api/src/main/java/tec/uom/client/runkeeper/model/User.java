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

package tec.uom.client.runkeeper.model;

import org.agorava.spi.UserProfile;

import tec.uom.client.runkeeper.RunKeeper;

/**
 * Created by IntelliJ IDEA.
 * User: Werner Keil
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class User extends UserProfile {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4026918068376292066L;
	private final String encodedId;
    private final String displayName;
//    private final Gender gender;
    private String strength_training_activities;
    private String weight;
    private String settings;
    private String diabetes;
    private String team;
    private String sleep;
    private String fitness_activities;
    private String change_log;
    private long userID;
    private String nutrition;
    private String general_measurements;
    private String background_activities;
    private String records;
    private String profile;
    private String avatar;
    
	public User(String encodedId, String displayName, String imageUrl) {
		super(encodedId, RunKeeper.class);
		this.encodedId = encodedId;
		this.displayName = displayName;
		this.avatar = imageUrl;
	}

    public String getStrengthTrainingActivities() {
        return strength_training_activities;
    }

    public String getWeight() {
        return weight;
    }

    public String getSettings() {
        return settings;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public String getTeam() {
        return team;
    }

    public String getSleep() {
        return sleep;
    }

    public String getFitnessActivities() {
        return fitness_activities;
    }

    public String getChangeLog() {
        return change_log;
    }

    public long getUserID() {
        return userID;
    }

    public String getNutrition() {
        return nutrition;
    }

    public String getGeneralMeasurements() {
        return general_measurements;
    }

    public String getBackgroundActivities() {
        return background_activities;
    }

    public String getRecords() {
        return records;
    }

    public String getProfile() {
        return profile;
    }

    @Override
    public String getFullName() {
        return displayName;
    }

	@Override
	public String getProfileImageUrl() {
		return avatar;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLoginName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	  @Override
	    public String toString() {
	        return "User{" +
	                "strength_training_activities='" + strength_training_activities + '\'' +
	                ", weight='" + weight + '\'' +
	                ", settings='" + settings + '\'' +
	                ", diabetes='" + diabetes + '\'' +
	                ", team='" + team + '\'' +
	                ", sleep='" + sleep + '\'' +
	                ", fitness_activities='" + fitness_activities + '\'' +
	                ", change_log='" + change_log + '\'' +
	                ", userID=" + userID +
	                ", nutrition='" + nutrition + '\'' +
	                ", general_measurements='" + general_measurements + '\'' +
	                ", background_activities='" + background_activities + '\'' +
	                ", records='" + records + '\'' +
	                ", profile='" + profile + '\'' +
	                '}';
	    }

}
