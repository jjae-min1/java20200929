package Chap18.textbook.s180702;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
//		�ٸ� PC�� DATA�� �ְ�ޱ����ؼ� �� PC�� Socket�� �ʿ�, socket�� ����� �������
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("172.30.1.22", 5001)); 
//			�� pc�ּҷ� socket�ּ� ����  (ip�ּ�, ��Ʈ��ȣ(Application��ȣ)
			
			
			while(true) {
				System.out.println("[�����ٸ�]");
				Socket socket = serverSocket.accept(); 
//				������ �ϱ����ؼ� ������ ��ٷ����� (��ٸ��� �޼ҵ� accept)
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[���� ������]" + isa.getHostName());
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
// �������ϰ�ü���� -> bind�޼ҵ忡 InetSocketAddress(�ּ�, ��Ʈ�ּ�)�ν��Ͻ��� �־� �����ּҼ�û
// ���ϰ�ü�� ������ �������ϰ�ü�� �����Ͽ� accept�޼ҵ�� ���� ��ٸ�
// InetSocketAddress��ü�� �����Ͽ� ���ϰ�ü�� getRemoteSocketAddress()�޼ҵ� �¿� ���� ����(����ĳ����)
// ���ܹ߻��� �������ϰ�ü�� �������������� �ݾ���
