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
			fos.write(readBytes, 0, readByteNo); // 마지막 read매소드를 타면 readByteNo가 100보다 작아짐
//			                                        해당길이만큼의 바이트들을 읽어옴
		}
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
		
	}

}
