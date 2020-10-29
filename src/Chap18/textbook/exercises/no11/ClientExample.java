package Chap18.textbook.exercises.no11;

import java.net.*;
import java.io.*;

public class ClientExample {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("172.30.1.22", 5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath = "jenny.jpg";
		File file = new File(filePath);
		String fileName = file.getName();
		
		byte[] bytes = new byte[100];
		fileName.getBytes(0, fileName.length(), bytes, 0);
		os.write(bytes);
		
		
		
		
		
		System.out.println("[파일보내기시작]");
		FileInputStream fis = new FileInputStream(filePath);
		int readByteCount = 1;
		while((readByteCount = fis.read()) != -1) {
			os.write(readByteCount);
//			os.write(bytes, 0, readByteCount);
		}
		
		os.flush();
		System.out.println("[파일보내기완료]");
		
		fis.close();
		os.close();
		socket.close();
		
		
		
		
		
	}

}
