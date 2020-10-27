package Chap18.textbook.s180502;
import java.io.*;
public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream("04. �⺻ Ÿ�԰� ���� Ÿ���� ���� - new instance.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("copy01. �⺻Ÿ�԰� ����Ÿ���� ���� - new instance.png");
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close(); bis.close(); fis.close();
		System.out.println("�������� �� : " + (end-start) + "ms");
		
		
		fis = new FileInputStream("04. �⺻ Ÿ�԰� ���� Ÿ���� ���� - new instance.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("copy01. �⺻Ÿ�԰� ����Ÿ���� ���� - new instance.png");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		end = System.currentTimeMillis();
		bos.close(); fos.close(); bis.close(); fis.close();
		System.out.println("������� �� : " + (end-start) + "ms");
		
	}

}
