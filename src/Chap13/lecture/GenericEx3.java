package Chap13.lecture;

public class GenericEx3 {
	public static void main(String[] args) {
		GenericEx3.<String> method("java");
		method("hello");
		method(3);
		
		String s = method2("dd");
		Integer i = method2(10);
	}
	
	public static <T> T method2(T t) {
		return null;
	}
	
	public static <T> void method(T t) {
		System.out.println(t);
	}

}
