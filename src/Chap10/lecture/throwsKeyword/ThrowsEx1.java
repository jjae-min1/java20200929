package Chap10.lecture.throwsKeyword;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsEx1 {
	public static void main(String[] args) throws Exception {
		
		method1();  //���ʷ� ������ �� ���� ���ѱ�� JVM���� ���Ѱ���, �׷��� ���ܻ�Ȳ �߻���
		
	}
	
	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() throws Exception{
		method3();
	}
	
	public static void method3() throws ClassNotFoundException, FileNotFoundException { 
//		�ش� �޼ҵ� ������ ClassNotFoundException�� �߻��ϸ� ���� ó������ �ʰ�
//		�ٸ� �޼ҵ忡�� ���ܸ� ó���ϵ��� ���ѱ� (throws)
//		Exception���� �ܼ��� �����Ͽ� ��� ����ó���� ���ѱ� ���� ����
//		���� ������ ���ܰ� �߻��� �� ������ , �� �����Ͽ� ������ ����
		
		Class.forName("java.lang.String2");
		FileReader fr = new FileReader("File.txt");
		
	}

}
