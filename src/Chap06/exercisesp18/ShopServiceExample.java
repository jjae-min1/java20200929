package Chap06.exercisesp18;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService o1 = ShopService.getInstance();
		ShopService o2 = ShopService.getInstance();
		
		if(o1 == o2) {
			System.out.println("���� ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� ��ü�Դϴ�.");
			
		}
	}

}
