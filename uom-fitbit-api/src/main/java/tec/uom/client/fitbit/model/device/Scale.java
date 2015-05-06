package tec.uom.client.fitbit.model.device;

import javax.measure.Quantity;
import javax.measure.quantity.Time;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class Scale {

    private final String id;
    private final String name;
    private final String network;
    private final String battery;
    private final Quantity<Time> lastSyncTime;
    private final Quantity<Time> lastMeasurementTime;
    private final Quantity<Time> lastMeasurementTimeForMe;
	private final String defaultUnit;
    private final int brightness;
    private final String color;
    private final ScaleVersion version;
    private final String firmwareVersion;

    public Scale(String id, String name, String network, String battery,
			Quantity<Time> lastSyncTime, Quantity<Time> lastMeasurementTime,
			Quantity<Time> lastMeasurementTimeForMe, String defaultUnit,
			int brightness, String color, ScaleVersion version,
			String firmwareVersion) {
		super();
		this.id = id;
		this.name = name;
		this.network = network;
		this.battery = battery;
		this.lastSyncTime = lastSyncTime;
		this.lastMeasurementTime = lastMeasurementTime;
		this.lastMeasurementTimeForMe = lastMeasurementTimeForMe;
		this.defaultUnit = defaultUnit;
		this.brightness = brightness;
		this.color = color;
		this.version = version;
		this.firmwareVersion = firmwareVersion;
	}
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNetwork() {
        return network;
    }

    public String getBattery() {
        return battery;
    }

    public Quantity<Time> getLastSyncTime() {
        return lastSyncTime;
    }

    public Quantity<Time> getLastMeasurementTime() {
        return lastMeasurementTime;
    }

    public Quantity<Time> getLastMeasurementTimeForMe() {
        return lastMeasurementTimeForMe;
    }

    public String getDefaultUnit() {
        return defaultUnit;
    }

    public int getBrightness() {
        return brightness;
    }

    public String getColor() {
        return color;
    }

    public String getVersion() {
        return version.name();
    }

    public ScaleVersion version() {
        return version;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }
}