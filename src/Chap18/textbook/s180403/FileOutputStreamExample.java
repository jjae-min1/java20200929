package Chap18.textbook.s180403;

import java.io.*;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception{
		String originalFileName = "src/Chap18/textbook/s180403/FileOutputStreamExample.java";
		String targetFileName = "copy.txt";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo); // ������ read�żҵ带 Ÿ�� readByteNo�� 100���� �۾���
//			                                        �ش���̸�ŭ�� ����Ʈ���� �о��
		}
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("���簡 �� �Ǿ����ϴ�.");
		
	}

}