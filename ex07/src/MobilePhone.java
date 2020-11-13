
public abstract class  MobilePhone {
	private Integer displaySize;
	private String vendor;
	private Integer batteryAmps;
	public abstract void sleepTimer();
	
	public MobilePhone() {
		this.displaySize = 0;
		this.vendor = "";
		this.batteryAmps = 0;
	}
	
	public MobilePhone(Integer displaySize, String vendor, Integer batteryAmps) {
		super();
		this.displaySize = displaySize;
		this.vendor = vendor;
		this.batteryAmps = batteryAmps;
	}

	public void switchOn() {
		System.out.println(this.vendor + " is Switched on");
	}	
	
	public Integer getDisplaySize() {
		return displaySize;
	}
	
	public void setDisplaySize(Integer displaySize) {
		this.displaySize = displaySize;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Integer getBatteryAmps() {
		return batteryAmps;
	}
	
	public void setBatteryAmps(Integer batteryAmps) {
		this.batteryAmps = batteryAmps;
	}
}
