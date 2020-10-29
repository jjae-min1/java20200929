package Chap18.textbook.s180702;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
//		다른 PC와 DATA를 주고받기위해선 각 PC에 Socket이 필요, socket을 만들고 연결과정
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("172.30.1.22", 5001)); 
//			내 pc주소로 socket주소 설정  (ip주소, 포트번호(Application번호)
			
			
			while(true) {
				System.out.println("[연결기다림]");
				Socket socket = serverSocket.accept(); 
//				연결을 하기위해선 한쪽이 기다려야함 (기다리는 메소드 accept)
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함]" + isa.getHostName());
			}
		}catch(Exception e) {
			if(!serverSocket.isClosed()) {
				try {
					serverSocket.close();
				}catch(IOException e1) {}
			}
		}
	}

}
// 서버소켓객체생성 -> bind메소드에 InetSocketAddress(주소, 포트주소)인스턴스를 넣어 소켓주소설청
// 소켓객체에 생성한 서버소켓객체를 대입하여 accept메소드로 연결 기다림
// InetSocketAddress객체를 생성하여 소켓객체를 getRemoteSocketAddress()메소드 태워 연결 수락(강제캐스팅)
// 예외발생시 서버소켓객체가 닫혀잇지않으면 닫아줌
