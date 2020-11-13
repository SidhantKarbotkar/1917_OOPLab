
public class SmartPhone extends MobilePhone {
	private Integer numberOfCameras ;
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
		super();
		this.numberOfCameras = 0;
	}

	public SmartPhone(Integer displaySize, String vendor, Integer batteryAmps, Integer numberOfCameras) {
		super(displaySize, vendor, batteryAmps);
		// TODO Auto-generated constructor stub
		this.numberOfCameras = numberOfCameras;
	}
	
	public void sleepTimer() {
		System.out.println(this.getVendor() + " display time is 30 secs");
	}
	
	public Integer getNumberOfCameras() {
		return numberOfCameras;
	}

	public void setNumberOfCameras(Integer numberOfCameras) {
		this.numberOfCameras = numberOfCameras;
	}
	
}
