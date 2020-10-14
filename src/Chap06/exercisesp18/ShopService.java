package Chap06.exercisesp18;

public class ShopService {
	
	private static ShopService shopservice = new ShopService();
	
	ShopService(){
		
	}
	
	static ShopService getInstance(){
		return shopservice;
	}
	

}
