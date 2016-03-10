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

package tec.uom.client.fitbit.model.user;

import java.util.Locale;

import hirondelle.date4j.DateTime;

import javax.measure.Quantity;
import javax.measure.Unit;
import javax.measure.quantity.Length;
import javax.measure.quantity.Mass;
import javax.measure.quantity.Volume;

import org.agorava.spi.UserProfile;

import tec.uom.client.fitbit.Fitbit;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class UserInfo extends UserProfile {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4026918068376292066L;
	private final String encodedId;
    private final String displayName;
    private final Gender gender;
    private final DateTime dateOfBirth;
    private final Quantity<Length> height;
    private final Quantity<Mass> weight;
    private final Quantity<Length> strideLengthWalking;
    private final Quantity<Length> strideLengthRunning;
    private final String fullName;
    private final String nickname;
    private final String country;
    private final String state;
    private final String city;
    private final String aboutMe;
    private final DateTime memberSince;
    /*private final TimeZone timezone;*/
    /**
     * Millisecond offset to add to UTC to get timezone
     */
    private final int offsetFromUTCMillis;
    private Locale locale; // TODO could we use Java Locale here?
    private final String avatar;
    
    private Unit<Mass> weightUnit;
    private Unit<Length> distanceUnit;
    private Unit<Length> heightUnit;
    private Unit<Volume> waterUnit;
    private Unit<Volume> glucoseUnit;
    
	public UserInfo(String encodedId, String displayName,
			Gender gender, DateTime dateOfBirth, Quantity<Length> height,
			Quantity<Mass> weight, Quantity<Length> strideLengthWalking,
			Quantity<Length> strideLengthRunning, String fullName,
			String nickname, String country, String state, String city,
			String aboutMe, DateTime memberSince, int offsetFromUTCMillis,
			Locale locale, String avatar, Unit<Mass> weightUnit,
			Unit<Length> distanceUnit, Unit<Length> heightUnit,
			Unit<Volume> waterUnit, Unit<Volume> glucoseUnit) {
		super(encodedId, Fitbit.class);
		this.encodedId = encodedId;
		this.displayName = displayName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.height = height;
		this.weight = weight;
		this.strideLengthWalking = strideLengthWalking;
		this.strideLengthRunning = strideLengthRunning;
		this.fullName = fullName;
		this.nickname = nickname;
		this.country = country;
		this.state = state;
		this.city = city;
		this.aboutMe = aboutMe;
		this.memberSince = memberSince;
		this.offsetFromUTCMillis = offsetFromUTCMillis;
		this.locale = locale;
		this.avatar = avatar;
		this.weightUnit = weightUnit;
		this.distanceUnit = distanceUnit;
		this.heightUnit = heightUnit;
		this.waterUnit = waterUnit;
		this.glucoseUnit = glucoseUnit;
	}

	public String getEncodedId() {
        return encodedId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Gender getGender() {
        return gender;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public Quantity<Length> getHeight() {
        return height;
    }

    public Quantity<Mass> getWeight() {
        return weight;
    }

    public Quantity<Length> getStrideLengthWalking() {
        return strideLengthWalking;
    }

    public Quantity<Length> getStrideLengthRunning() {
        return strideLengthRunning;
    }

    public String getFullName() {
        return fullName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public DateTime getMemberSince() {
        return memberSince;
    }

    /*public String getTimezone() {
        return timezone.toString();
    }

    public TimeZone timezone() {
        return timezone;
    }*/

    public int getOffsetFromUTCMillis() {
        return offsetFromUTCMillis;
    }

    public Locale getLocale() {
        return locale;
    }

    public String getAvatar() {
        return avatar;
    }

	public Unit<Mass> getWeightUnit() {
		return weightUnit;
	}

	public Unit<Length> getDistanceUnit() {
		return distanceUnit;
	}

	public Unit<Length> getHeightUnit() {
		return heightUnit;
	}

	public Unit<Volume> getWaterUnit() {
		return waterUnit;
	}

	public Unit<Volume> getGlucoseUnit() {
		return glucoseUnit;
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

}
