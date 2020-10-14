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
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("--------------------");
			System.out.println("선택>");
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
		System.out.println("프로그램 종료");
		
		
	}
	
	
	private static void createAccount() {
		System.out.println("계좌번호:");
		String enter1 = scanner.next();
		System.out.println("계좌주:");
		String enter2 = scanner.next();
		System.out.println("최초입금액:");
		int enter3 = scanner.nextInt();
		
		Account result = new Account(enter1, enter2, enter3);
		
		accountArray[count] = result;
		count++;
		
	}
	
	private static void accountList() {
		System.out.println("---------------");
		System.out.println("계좌목록");
		System.out.println("---------------");
		
		for(int i = 0; i < count ; i++) {
			System.out.println(accountArray[i].getAno() + accountArray[i].getOwner() + accountArray[i].getBalance());
		}
		
	}
	
	private static void desposit() {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		
		System.out.println("계좌번호:");
		String enter = scanner.next();
		
		Account result = findAccount(enter);
		System.out.println("입금액을 입력하세요:");
		int input = scanner.nextInt();
		
		result.setBalance(result.getBalance() + input);
		
		System.out.println("결과 : 입금됐습니다.");
		
	}
	
	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		
		System.out.println("계좌번호:");
		String enter = scanner.next();
		
		Account result = findAccount(enter);
		System.out.println("출금액을 입력하세요:");
		int input = scanner.nextInt();
		
		result.setBalance(result.getBalance() - input);
		
		System.out.println("결과 : 입금됐습니다.");
		
		
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
