package Chap06.lecture.constructor;

public class ConstructorEx01 {
	public static void main(String[] args) {
		Car car1 = new Car(); // Car() = ������
		Car car2 = new Car("hyundai");  //Car(carName) = ������
//		                                 �Ű������� ������ �ľ��Ͽ� ������ ������ ����
		
		System.out.println(car1.name);
		System.out.println(car1.price);
		
		System.out.println(car2.name);
		System.out.println(car2.price);
		
		Car car3 = new Car("volvo");
		Car car4 = new Car("benz");
		
		Car car5 = new Car("hyundai", 300);
		System.out.println(car5.name);
		System.out.println(car5.price);
	}
}
