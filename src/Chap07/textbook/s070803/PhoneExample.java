package Chap07.textbook.s070803;

public class PhoneExample {
	public static void main(String[] args) {
		
//	Phone phone = new Phone("홍길동"); abstract때문에 해당타입의 인스턴스 생성 불가
	SmartPhone smartphone = new SmartPhone("홍길동");
	
	smartphone.turnOn();
	smartphone.internetSearch();
	smartphone.turnOff();
	}
	
	

}
