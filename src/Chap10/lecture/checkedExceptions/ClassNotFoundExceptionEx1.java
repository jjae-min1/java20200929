package Chap10.lecture.checkedExceptions;

public class ClassNotFoundExceptionEx1 {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		try{
			System.out.println("try��� ����");
			Class.forName("java.lang.String"); // ����ó�� ������ �ʿ���
			System.out.println("�ͼ��� �߻� X");
		}catch(ClassNotFoundException e){
			System.out.println("�ͼ��� �߻�");
		}finally {								//try(catch)�� ���� �� finally�ڵ��� ������ ����
			System.out.println("������ ����");
		}
		System.out.println("���α׷� ����");
	}

}
