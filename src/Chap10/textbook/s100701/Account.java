package Chap10.textbook.s100701;

public class Account {
	private long balance;
	public Account(
			) {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance < money) {
			throw new BalanceInsufficientException("잔고 부족:" + (money-balance) + "모자람");
//			Exception 클래스를 상속받아 위와같이 스트링이 출력
		}
		balance -= money;
	}

}
