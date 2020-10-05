package chap03.textbook;

public class AccuracyExample2 {
	public static void main(String[] args) {
		//변수를 정수형으로 만들어 연산한 뒤 원상복구
		int apple1 = 1;
		int totalPieces = apple1 * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp / 10.0;
		
		System.out.println("사과 한 개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + "조각이 남는다.");
	}

}
