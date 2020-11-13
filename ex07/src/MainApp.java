

public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone m1 = new SmartPhone(5, "Moto G5", 4000, 4);
		m1.sleepTimer();	
		FeaturedPhone moto = new BandWFeaturedPhone(5, "Moto E1" , 4500, true , false);
		FeaturedPhone realme = new SmartEnableFeaturedPhone(6, "Realme 6", 4500, true, true);
		FeaturedPhone nokia = new SmartEnableFeaturedPhone(4, "Nokia 3310", 1000, false, false);
		
		FeaturedPhone mobiles[] = {moto,realme,nokia};
		
		System.out.println();
		
		for (int i = 0; i < mobiles.length; i++) mobiles[i].autoRotate();		
		
		BandWFeaturedPhone mi = new BandWFeaturedPhone(6, "mi A1", 5000, true, true);
		System.out.println();
		mi.bluetooth();
		mi.sleepTimer();
		SmartEnableFeaturedPhone apple = new SmartEnableFeaturedPhone(6, "iphone 6", 5000, true, true);
		System.out.println();
		apple.bluetooth();
		apple.sleepTimer();
	}
}