package Chap10.textbook.s100601;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}

}
