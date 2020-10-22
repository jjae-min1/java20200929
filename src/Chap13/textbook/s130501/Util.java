package Chap13.textbook.s130501;

public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
//		T제너릭이 Number클래스를 상속받아 해당 클래스내에 있는 타입으로 변수를 받을 수 있다
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return Double.compare(v1, v2);
	}

}
