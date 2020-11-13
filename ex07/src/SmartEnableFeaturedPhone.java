
public class SmartEnableFeaturedPhone extends FeaturedPhone{
	private Boolean isFingerprintSensor;
	
	public SmartEnableFeaturedPhone() {
		// TODO Auto-generated constructor stub
		super();
		this.isFingerprintSensor = false;
	}
	
	public SmartEnableFeaturedPhone(Integer displaySize, String vendor, Integer batteryAmps, Boolean isCamera, Boolean isFingerprintSensor) {
		super(displaySize, vendor, batteryAmps, isCamera);
		// TODO Auto-generated constructor stub
		this.isFingerprintSensor = isFingerprintSensor;
	}

	public void autoRotate() {
		System.out.println(this.getVendor() + " auto rotate is off");
	}
	
	public void sleepTimer() {
		System.out.println(this.getVendor() + " display time is 15 secs");
	}
	
	public void bluetooth() {
		System.out.println(this.getVendor() + "  Bluetooth is on");
	}
	
	public Boolean getIsFingerprintSensor() {
		return isFingerprintSensor;
	}

	public void setIsFingerprintSensor(Boolean isFingerprintSensor) {
		this.isFingerprintSensor = isFingerprintSensor;
	}
	
	
}
