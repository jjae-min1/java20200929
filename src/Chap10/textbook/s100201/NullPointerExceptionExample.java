package Chap10.textbook.s100201;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		
		System.out.println("���α׷� ����1");
		
		String data = null;
		if(data != null) {
			System.out.println(data.toString());  //�������Ϳ��ܹ߻�
		}
		System.out.println("���α׷� ����2");
	}

}
