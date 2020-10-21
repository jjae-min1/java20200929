package chap11.textbook.wrapper;

public class WrapperEx1 {
	public static void main(String[] args) {

//      기본타입		
//		byte, short, int, long
//		float, double, char, boolean
		
		
//		참조타입
//		Byte, Short, Int, Long
//		Float, Double, Char, Boolean
		
		int i = 1;
		
		Integer in = Integer.valueOf(i);
		
		method1(in);
		
		int j = 2;
		method1(j);     //자동 박싱
		
		int l = in.intValue();
		int k = in;               //자동 언박싱
		
		Integer in2 = 3;
		int m = in2;          //자유롭게 사용 가능
	}
	
	public static void method1(Object o) {
		System.out.println(o);
	}

}
