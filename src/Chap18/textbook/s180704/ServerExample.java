package Chap18.textbook.s180704;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
//			서버주소 저장
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("172.30.1.22", 5001));
			
			
			while(true) {
//				서버에 접속요청 대기
				System.out.println("[연결기다림]");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함]" + isa.getHostName());
				
//				받는틀(요구사항 확인)
				byte[] bytes = null;
				String message = null;
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("[데이터 받기 성공]" + message);
				
//				보내는 틀(요청한 사이트 보내기)
				OutputStream os = socket.getOutputStream();
				message = "Hello Client";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[데이터 보내기 성공]");
				
				is.close();os.close();socket.close();
				
				
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
			try{
				serverSocket.close();
			}
		catch (IOException e1) {
			e1.printStackTrace();
		}
			
		
		
		}
	}
}

