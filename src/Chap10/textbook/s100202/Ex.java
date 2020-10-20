package Chap10.textbook.s100202;

public class Ex {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생");
		}
	}

}
