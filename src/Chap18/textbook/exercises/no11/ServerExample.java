package Chap18.textbook.exercises.no11;
import java.io.*;
import java.net.*;

public class ServerExample {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("172.30.1.22", 5001));
		
		System.out.println("[서버 시작]");
		
		while(true) {
			try {
				Socket socket = serverSocket.accept();
				InputStream is = socket.getInputStream();
				
				byte[] bytes = new byte[1000];
				int readByteCount = -1;
				
				readByteCount = is.read(bytes, 0, 1000);
				System.out.println("첫 바이트:" + readByteCount);
				String fileName = new String(bytes, 0, readByteCount);
				fileName = fileName.trim();
				
				
				
				System.out.println("[파일받기시작]");
				FileOutputStream fos = new FileOutputStream("c:/temp/" +fileName);
				while((readByteCount = is.read(bytes))!=-1) {
					fos.write(bytes, 0, readByteCount);
				}
				
				fos.close();
				is.close();
				socket.close();
			}catch(Exception e) {
				e.printStackTrace();
				break;
			}
		}
		serverSocket.close();
		System.out.println("[서버 종료]");
		
	}

}
