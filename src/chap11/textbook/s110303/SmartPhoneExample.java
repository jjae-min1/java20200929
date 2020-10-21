package chap11.textbook.s110303;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		SmartPhone iPhone = new SmartPhone("apple", "ios");
		
		String strobj = myPhone.toString();
		System.out.println(strobj);
		
		System.out.println(myPhone.toString());
		System.out.println(iPhone);
	}

}
