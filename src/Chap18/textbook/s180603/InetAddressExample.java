package Chap18.textbook.s180603;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost(); 
			System.out.println("����ǻ�� IP�ּ� : " + local.getHostAddress());
			//����ǻ�� �ּ� ȣ���ϴ� �޼ҵ�
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com"); //domain�ּ�ȣ��
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP�ּ� : " + remote.getHostAddress());
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
