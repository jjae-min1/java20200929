package Chap18.textbook.s180504;
import java.io.*;
public class PrintStreamExample {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("file.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[������ ���� ��Ʈ��]"); //PrintStream��ü�� println , print �޼ҵ带 ���� ���
		ps.print("��ġ ");
		ps.println("�����Ͱ� ����ϴ� ��ó��");
		ps.println("�����͸� ����մϴ�.");
		
		ps.flush();
		ps.close();
		fos.close();
		
	}

}
