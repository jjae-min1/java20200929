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
		
		fis = new FileInputStream("04. 기본 타입과 참조 타입의 차이 - new instance.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("copy01. 기본타입과 참조타입의 차이 - new instance.png");
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close(); bis.close(); fis.close();
		System.out.println("사용안했을 때 : " + (end-start) + "ms");
		
		
		fis = new FileInputStream("04. 기본 타입과 참조 타입의 차이 - new instance.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("copy01. 기본타입과 참조타입의 차이 - new instance.png");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		end = System.currentTimeMillis();
		bos.close(); fos.close(); bis.close(); fis.close();
		System.out.println("사용했을 때 : " + (end-start) + "ms");
		
	}

}
