package chap11.textbook.s111203;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
//		String Ÿ���� �⺻ Ÿ�� ���� �ٲ��ִ� ������
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("True");
		
//		valueOf() ���� �������� ����Ÿ���� ��ȯ������ �ڵ� ��ڽ��ϱ⿡ ���� ����
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
	}

}
