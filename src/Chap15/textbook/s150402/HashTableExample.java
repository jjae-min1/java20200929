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
			System.out.println("���̵�� ��й�ȣ �Է����ּ���");
			System.out.println("Id : ");
			String id = scanner.nextLine();
			
			System.out.println("password : ");
			String password =  scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).contentEquals(password)) {
					System.out.println("�α��� Ȯ��");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		}

	}
}
