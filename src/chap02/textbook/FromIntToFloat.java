package chap02.textbook;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result); //float형은 가수부분이 23비트여서 int형을 float형으로 변환시 정밀도 손실 발생
	}

}
