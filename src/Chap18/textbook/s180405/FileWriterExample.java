package Chap18.textbook.s180405;

import java.io.*;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		File file = new File("file.txt");  //file.txt��� ������ file�� ����
		FileWriter fw = new FileWriter(file, true);  //true : ������ ���ϳ��� ���� �߰�
		fw.write("FileWriter�� �ѱ۷ε� " + "\r\n" );
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�." + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");
	}

}
