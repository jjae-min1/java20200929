package Chap10.lecture.runtimeExceptions;

public class Ex {
	public static void main(String[] args) {
		
	
	
		int[] arr = null;
		
		try {
			System.out.println("1");
			System.out.println(arr.length);
		}catch(NullPointerException e) {
			System.out.println("예외발생");
		}
	}
}
