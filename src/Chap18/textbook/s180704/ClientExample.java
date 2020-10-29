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
			
//			���ϰ�ü�����ؼ� �����û
			socket = new Socket();
			System.out.println("[�����û]");
			socket.connect(new InetSocketAddress("172.30.1.22", 5001));
			System.out.println("[���Ἲ��]");
			
			
			
//			������ Ʋ (���̹��� �˻�)
			byte[] bytes = null;
			String message = null;
			OutputStream os = socket.getOutputStream();
			message = "Hello Server";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[������ ������ ����]");
			
			
			
//			�޴� Ʋ(�˻��� ȭ�� �ޱ�)
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes); //socket���� is�� �б�
			message = new String(bytes, 0, readByteCount, "UTF-8"); //stringŸ������ �ޱ�
			System.out.println("[������ �ޱ� ����]: " + message);
			
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
