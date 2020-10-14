package Chap06.exercisesp20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int count = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("--------------------------------------------------");
			System.out.println("����>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
	
	private static void createAccount() {
		
		System.out.println("------------------");
		System.out.println("���»���");
		System.out.println("------------------");
		
		System.out.println("���¹�ȣ:");
		String enter1 = scanner.next();
		System.out.println("������:");
		String enter2 = scanner.next();
		System.out.println("�ʱ��Աݾ�");
		int enter3 = scanner.nextInt();
		
		Account cur = new Account(enter1, enter2, enter3);
		
		accountArray[count] = cur; 
		count++;
		System.out.println("���: ���°� �����ƽ��ϴ�.");
		
		
		
		
	
		
		
		
		
	}
	
	private static void accountList() {
		System.out.println("------------");
		System.out.println("���¸��");
		System.out.println("------------");
		
		for(int i = 0; i <count ; i++) {
			Account cur = accountArray[i];
			System.out.println(cur.getAno() + "\t" + cur.getOwner() + "\t" + cur.getBalance());
		}	
	}
	
	private static void deposit() {
		String enter;
		System.out.println("���¹�ȣ:");
		enter = scanner.next();
		Account cur = findAccount(enter);
		System.out.println("���ݾ�");
		int money = scanner.nextInt();
		cur.setBalance(cur.getBalance() + money);
		System.out.println("���: ������ �����ƽ��ϴ�.");
		
	}
	
	private static void withdraw() {
		String enter;
		System.out.println("���¹�ȣ:");
		enter = scanner.next();
		Account cur = findAccount(enter);
		System.out.println("��ݾ�");
		int money = scanner.nextInt();
		cur.setBalance(cur.getBalance() - money);
		System.out.println("���: ������ �����ƽ��ϴ�.");
		
	}
	
	private static Account findAccount(String ano) {
		for(int i = 0; i < count ; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
		
	}
}
