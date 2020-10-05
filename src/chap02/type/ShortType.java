package chap02.type;

public class ShortType {
	public static void main(String[] args) {
		//short : 2byte  MAX = 32767, Min = -32768
		
		short shortValue1;
		
		shortValue1 = 32767;
		
		System.out.println(shortValue1);
		
//		shortValue1 = 32768; 범위 벗어나는 값으로 선언 불가
		
		shortValue1 = -32768;
		System.out.println(shortValue1);
		
	}

}
