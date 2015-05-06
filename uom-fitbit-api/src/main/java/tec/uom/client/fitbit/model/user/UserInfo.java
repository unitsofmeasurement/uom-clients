package tec.uom.client.fitbit.model.user;

import javax.measure.Quantity;
import javax.measure.quantity.Length;
import javax.measure.quantity.Mass;

import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;

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
    private final LocalDate dateOfBirth;
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
    private final LocalDate memberSince;
    private final DateTimeZone timezone;
    /**
     * Millisecond offset to add to UTC to get timezone
     */
    private final int offsetFromUTCMillis;
    private String locale;
    private final String avatar;

    public UserInfo(String encodedId, String displayName, Gender gender,
			LocalDate dateOfBirth, Quantity<Length> height,
			Quantity<Mass> weight, Quantity<Length> strideLengthWalking,
			Quantity<Length> strideLengthRunning, String fullName,
			String nickname, String country, String state, String city,
			String aboutMe, LocalDate memberSince, DateTimeZone timezone,
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

    public LocalDate getDateOfBirth() {
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

    public LocalDate getMemberSince() {
        return memberSince;
    }

    public String getTimezone() {
        return timezone.toString();
    }

    public DateTimeZone timezone() {
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
