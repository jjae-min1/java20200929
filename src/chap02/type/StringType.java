package chap02.type;

public class StringType {
	public static void main(String[] args) {
//		String : ���ڿ� ����
		
		String input = "3.14";
		double v = Double.valueOf(input);        //��Ʈ������ ���������� ��ȯ
//		double v = (double) input;    ������ �⺻Ÿ���� ��������ȯ �Ұ�
		System.out.println(v);
		
		String carName;
		carName = "Kia";
		
		System.out.println(carName);
		System.out.println("");
		System.out.println("�������ڿ�..");
		System.out.println("ū����ǥ\" ��������ǥ'");
	}

}
