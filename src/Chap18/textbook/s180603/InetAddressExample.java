package Chap18.textbook.s180603;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost(); 
			System.out.println("내컴퓨터 IP주소 : " + local.getHostAddress());
			//내컴퓨터 주소 호출하는 메소드
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com"); //domain주소호출
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP주소 : " + remote.getHostAddress());
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
