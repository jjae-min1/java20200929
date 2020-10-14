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
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.println("선택>");
			
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
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		
		System.out.println("------------------");
		System.out.println("계좌생성");
		System.out.println("------------------");
		
		System.out.println("계좌번호:");
		String enter1 = scanner.next();
		System.out.println("계좌주:");
		String enter2 = scanner.next();
		System.out.println("초기입금액");
		int enter3 = scanner.nextInt();
		
		Account cur = new Account(enter1, enter2, enter3);
		
		accountArray[count] = cur; 
		count++;
		System.out.println("결과: 계좌가 생성됐습니다.");
		
		
		
		
	
		
		
		
		
	}
	
	private static void accountList() {
		System.out.println("------------");
		System.out.println("계좌목록");
		System.out.println("------------");
		
		for(int i = 0; i <count ; i++) {
			Account cur = accountArray[i];
			System.out.println(cur.getAno() + "\t" + cur.getOwner() + "\t" + cur.getBalance());
		}	
	}
	
	private static void deposit() {
		String enter;
		System.out.println("계좌번호:");
		enter = scanner.next();
		Account cur = findAccount(enter);
		System.out.println("예금액");
		int money = scanner.nextInt();
		cur.setBalance(cur.getBalance() + money);
		System.out.println("결과: 예금이 성공됐습니다.");
		
	}
	
	private static void withdraw() {
		String enter;
		System.out.println("계좌번호:");
		enter = scanner.next();
		Account cur = findAccount(enter);
		System.out.println("출금액");
		int money = scanner.nextInt();
		cur.setBalance(cur.getBalance() - money);
		System.out.println("결과: 예금이 성공됐습니다.");
		
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
