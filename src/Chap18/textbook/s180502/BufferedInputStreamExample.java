package Chap18.textbook.s180502;
import java.io.*;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception{
		long start = 0;
		long end = 0;
		
		FileInputStream fis = new FileInputStream("src/Chap18/textbook/s180502/BufferedInputStreamExample.java");
		start = System.currentTimeMillis();
		while(fis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("������� �ʾ��� �� : " + (end-start) +"ms");
		fis.close();
		
		
		FileInputStream fis2 = new FileInputStream("src/Chap18/textbook/s180502/BufferedInputStreamExample.java");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		start = System.currentTimeMillis();
		while(bis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("������� �� : " + (end-start) + "MS");
		bis.close();
		fis2.close();
		
	}

}
