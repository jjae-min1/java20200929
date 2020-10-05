package chap02.textbook;

public class FromIntToDouble {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		
		System.out.println(result); // int형을 double형으로 강제전환하여도 정밀도 손실 x
				
	}

}
