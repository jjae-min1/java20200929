package Chap18.textbook.s180704;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			
//			소켓객체생성해서 연결요청
			socket = new Socket();
			System.out.println("[연결요청]");
			socket.connect(new InetSocketAddress("172.30.1.22", 5001));
			System.out.println("[연결성공]");
			
			
			
//			보내는 틀 (네이버에 검색)
			byte[] bytes = null;
			String message = null;
			OutputStream os = socket.getOutputStream();
			message = "Hello Server";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[데이터 보내기 성공]");
			
			
			
//			받는 틀(검색한 화면 받기)
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes); //socket받은 is로 읽기
			message = new String(bytes, 0, readByteCount, "UTF-8"); //string타입으로 받기
			System.out.println("[데이터 받기 성공]: " + message);
			
			os.close();
			is.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(!socket.isClosed()) {
			try {
				socket.close();
			}catch(IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
