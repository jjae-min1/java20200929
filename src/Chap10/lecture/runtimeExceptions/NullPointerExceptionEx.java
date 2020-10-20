package Chap10.lecture.runtimeExceptions;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		int[] a = null;      //가르키고있는 인스턴스 참조값이 없다
		
		System.out.println(a.length);  //널포인터익셉션(런타임익셉션)
		
	}

}
