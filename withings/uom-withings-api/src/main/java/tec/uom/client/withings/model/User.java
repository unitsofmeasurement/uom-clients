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
package tec.uom.client.withings.model;

import org.agorava.spi.UserProfile;

import tec.uom.client.withings.Withings;

/**
 * Model class containing Withings athlete's profile information.
 *
 * @author Werner Keil
 */

@SuppressWarnings("serial")
public class User extends UserProfile {
    private final String login;
    private final String email;
    private String resourceState;
    private String firstName;
    private String lastName;
    private String profile_medium_url;
    private String profile_url;
    private String city;
    private String state;
    private String sex;
    private String friend;
    private String follower;
    private boolean premium;
    private String createdAt;
    private String updatedAt;
    private boolean approveFollowers;
    private int followerCount;
    private int friendCount;
    private int mutualFriendCount;
    private String datePreference;
    private String measurementPreference;
    private int ftp;
    
    public User(String id, String login, String firstName, String lastName, String email, String avatar_url) {
        super(id, Withings.class);
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.profile_url = avatar_url;
    }

    /**
     * The Athlete's Withings login
     *
     * @return the user's login
     */
    public String getLogin() {
        return login;
    }

//    @Override
    public String getLoginName() {
        return login;
    }

    @Override
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getProfileImageUrl() {
        return profile_url;
    }
    
    public String getProfileMediumImageUrl() {
        return profile_medium_url;
    }

	public String getResourceState() {
		return resourceState;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getSex() {
		return sex;
	}

	public String getFriend() {
		return friend;
	}

	public String getFollower() {
		return follower;
	}

	public boolean isPremium() {
		return premium;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public boolean doesApproveFollowers() { // TODO check for bean signature (use is or get if needed)
		return approveFollowers;
	}

	public int getFollowerCount() {
		return followerCount;
	}

	public int getFriendCount() {
		return friendCount;
	}

	public int getMutualFriendCount() {
		return mutualFriendCount;
	}

	public String getDatePreference() {
		return datePreference;
	}

	public String getMeasurementPreference() {
		return measurementPreference;
	}

	public int getFtp() {
		return ftp;
	}
}
