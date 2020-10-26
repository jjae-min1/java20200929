package Chap15.textbook.s150402;

import  java.util.*;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호 입력해주세요");
			System.out.println("Id : ");
			String id = scanner.nextLine();
			
			System.out.println("password : ");
			String password =  scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).contentEquals(password)) {
					System.out.println("로그인 확인");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}

	}
}
