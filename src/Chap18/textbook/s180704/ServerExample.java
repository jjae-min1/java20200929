package Chap18.textbook.s180704;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
//			�����ּ� ����
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("172.30.1.22", 5001));
			
			
			while(true) {
//				������ ���ӿ�û ���
				System.out.println("[�����ٸ�]");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[���� ������]" + isa.getHostName());
				
//				�޴�Ʋ(�䱸���� Ȯ��)
				byte[] bytes = null;
				String message = null;
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("[������ �ޱ� ����]" + message);
				
//				������ Ʋ(��û�� ����Ʈ ������)
				OutputStream os = socket.getOutputStream();
				message = "Hello Client";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[������ ������ ����]");
				
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

