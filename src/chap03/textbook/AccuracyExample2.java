package chap03.textbook;

public class AccuracyExample2 {
	public static void main(String[] args) {
		//������ ���������� ����� ������ �� ���󺹱�
		int apple1 = 1;
		int totalPieces = apple1 * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp / 10.0;
		
		System.out.println("��� �� ������");
		System.out.println("0.7 ������ ����");
		System.out.println(result + "������ ���´�.");
	}

}
