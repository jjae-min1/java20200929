package chap14.lecture.api.function;

import java.util.function.Function;

public class FunctionEx1 {
	public static void main(String[] args) {
//		Function : 입력한 매개변수값을 출력하는 return타입에 매칭해줌
//		디폴트메소드 : apply
		Function<String, Integer> strToint = s -> Integer.valueOf(s) * 2;
		int i = strToint.apply("30");
		System.out.println(i);
		
		Function<Integer, String> intTostr = x -> "값" + x;
		String str = intTostr.apply(5);
		System.out.println(str);
	}

}
