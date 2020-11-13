
public abstract class FeaturedPhone  extends MobilePhone{
	private Boolean isCamera;
	public FeaturedPhone() {
		// TODO Auto-generated constructor stub
		super();
		this.isCamera=false;
	}
	
	public FeaturedPhone(Integer displaySize, String vendor, Integer batteryAmps, Boolean isCamera) {
		super(displaySize, vendor, batteryAmps);
		this.isCamera = isCamera;
	}
	

	public abstract void autoRotate();
	
	/*public void sleepTimer() {		
		System.out.println(this.getVendor() + "display time is 15 secs");
	}*/
	
	public Boolean getIsCamera() {
		return isCamera;
	}
	
	public void setIsCamera(Boolean isCamera) {
		this.isCamera = isCamera;
	}
}
