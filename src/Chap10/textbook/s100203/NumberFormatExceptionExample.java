package Chap10.textbook.s100203;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
//		String data2 = "a100";  정수형이 아니라 예외발생
		String data2 = "200";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	}

}
