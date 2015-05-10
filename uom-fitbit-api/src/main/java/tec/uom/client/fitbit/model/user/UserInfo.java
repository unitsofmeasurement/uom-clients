package tec.uom.client.fitbit.model.user;

import hirondelle.date4j.DateTime;

import java.util.TimeZone;

import javax.measure.Quantity;
import javax.measure.quantity.Length;
import javax.measure.quantity.Mass;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class UserInfo {

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
    private final TimeZone timezone;
    /**
     * Millisecond offset to add to UTC to get timezone
     */
    private final int offsetFromUTCMillis;
    private String locale;
    private final String avatar;

    public UserInfo(String encodedId, String displayName, Gender gender,
    		DateTime dateOfBirth, Quantity<Length> height,
			Quantity<Mass> weight, Quantity<Length> strideLengthWalking,
			Quantity<Length> strideLengthRunning, String fullName,
			String nickname, String country, String state, String city,
			String aboutMe, DateTime memberSince, TimeZone timezone,
			int offsetFromUTCMillis, String locale, String avatar) {
		super();
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
		this.timezone = timezone;
		this.offsetFromUTCMillis = offsetFromUTCMillis;
		this.locale = locale;
		this.avatar = avatar;
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

    public String getTimezone() {
        return timezone.toString();
    }

    public TimeZone timezone() {
        return timezone;
    }

    public int getOffsetFromUTCMillis() {
        return offsetFromUTCMillis;
    }

    public String getLocale() {
        return locale;
    }

    public String getAvatar() {
        return avatar;
    }

}
