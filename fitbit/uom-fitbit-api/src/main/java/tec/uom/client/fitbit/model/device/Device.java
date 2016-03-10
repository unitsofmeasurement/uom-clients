package tec.uom.client.fitbit.model.device;

import javax.measure.Quantity;
import javax.measure.quantity.Time;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class Device {
    /**
     * Device id
     */
    private final String id;
    private final DeviceType type;
    /**
     * The battery level of the Fitbit device, one of Low, Medium, High, and Full. The level is "Low" when no
     * information is available.
     */
    private final String battery;

    private final Quantity<Time> lastSyncTime;
    private final String deviceVersion;

    public Device(String id, DeviceType type, String battery,
			Quantity<Time> lastSyncTime, String deviceVersion) {
		this.id = id;
		this.type = type;
		this.battery = battery;
		this.lastSyncTime = lastSyncTime;
		this.deviceVersion = deviceVersion;
	}

	public String getId() {
        return id;
    }

    public String getType() {
        return type.name();
    }

    public DeviceType type() {
        return type;
    }

    public String getBattery() {
        return battery;
    }

    public Quantity<Time> getLastSyncTime() {
        return lastSyncTime;
    }

    public String getDeviceVersion() {
        return deviceVersion;
    }
}
