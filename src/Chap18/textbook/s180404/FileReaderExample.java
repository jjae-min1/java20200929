package Chap18.textbook.s180404;

import java.io.*;

public class FileReaderExample {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("src/Chap18/textbook/s180404/FileReaderExample.java");
		
		int readCharNo; //�ش�迭�� �Ҵ�Ǵ� ���� ��
		char[] cbuf = new char[100];  //reader�� �Ű������� char�� �迭�� ����
		while((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0 , readCharNo);
			System.out.print(data);
		}
		fr.close();
		System.exit(0);
	}

}
