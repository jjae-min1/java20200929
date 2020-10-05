package chap03.binary;

public class ConcatOperator {
	public static void main(String[] args) {
//		연결연산자 concatenate
		int a = 3;
		int b = 5;
		int c = a + b;
		
		String s = "9";
		String d = a + s + b + c;          //스트링과 정수형의 덧셈연산의 결과는 String
		
		System.out.println(d);
	}

}
