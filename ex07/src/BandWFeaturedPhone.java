
public class BandWFeaturedPhone extends FeaturedPhone {
	private Boolean isFaceLock;
	
	public BandWFeaturedPhone() {
		// TODO Auto-generated constructor stub
		super();
		this.isFaceLock = false;
	}

	public BandWFeaturedPhone(Integer displaySize, String vendor, Integer batteryAmps, Boolean isCamera, Boolean isFaceLock) {
		super(displaySize, vendor, batteryAmps, isCamera);
		// TODO Auto-generated constructor stub
		this.isFaceLock = isFaceLock;
	}

	public void autoRotate() {
		System.out.println(this.getVendor() + " auto rotate is on");
	}
	
	public void sleepTimer() {
		System.out.println(this.getVendor() + " display time is 10 secs");
	}
	
	public void bluetooth() {
		System.out.println(this.getVendor() + " Bluetooth is off");
	}
	
	public Boolean getIsFaceLock() {
		return isFaceLock;
	}

	public void setIsFaceLock(Boolean isFaceLock) {
		this.isFaceLock = isFaceLock;
	}
	
	
}
