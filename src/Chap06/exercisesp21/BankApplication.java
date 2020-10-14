package Chap06.exercisesp21;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int count = 0;
	
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------");
			System.out.println("1.���»��� 2.���¸�� 3.���� 4.��� 5.����");
			System.out.println("--------------------");
			System.out.println("����>");
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				desposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}			
				
		}
		System.out.println("���α׷� ����");
		
		
	}
	
	
	private static void createAccount() {
		System.out.println("���¹�ȣ:");
		String enter1 = scanner.next();
		System.out.println("������:");
		String enter2 = scanner.next();
		System.out.println("�����Աݾ�:");
		int enter3 = scanner.nextInt();
		
		Account result = new Account(enter1, enter2, enter3);
		
		accountArray[count] = result;
		count++;
		
	}
	
	private static void accountList() {
		System.out.println("---------------");
		System.out.println("���¸��");
		System.out.println("---------------");
		
		for(int i = 0; i < count ; i++) {
			System.out.println(accountArray[i].getAno() + accountArray[i].getOwner() + accountArray[i].getBalance());
		}
		
	}
	
	private static void desposit() {
		System.out.println("-----------");
		System.out.println("����");
		System.out.println("-----------");
		
		System.out.println("���¹�ȣ:");
		String enter = scanner.next();
		
		Account result = findAccount(enter);
		System.out.println("�Աݾ��� �Է��ϼ���:");
		int input = scanner.nextInt();
		
		result.setBalance(result.getBalance() + input);
		
		System.out.println("��� : �Աݵƽ��ϴ�.");
		
	}
	
	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("���");
		System.out.println("-----------");
		
		System.out.println("���¹�ȣ:");
		String enter = scanner.next();
		
		Account result = findAccount(enter);
		System.out.println("��ݾ��� �Է��ϼ���:");
		int input = scanner.nextInt();
		
		result.setBalance(result.getBalance() - input);
		
		System.out.println("��� : �Աݵƽ��ϴ�.");
		
		
	}
	
	private static Account findAccount(String ano) {
		for(int i = 0; i < count ; i++) {
			if(accountArray[i].getAno() == ano ) {
				return accountArray[i];
				
			}
		
		}
		return null;
	}
	
	
	
	
}
