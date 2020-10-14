package Chap06.exercisesp19;

public class Account {
	int balance = 0;
	int MIN_BALANCE = 0;
	int MAX_BALANCE = 1000000;
	
	void setBalance(int balance) {
		if(MIN_BALANCE <= balance && MAX_BALANCE >= balance) {
			this.balance = balance;
		}
	}
	
	int getBalance() {
		return this.balance;
	}

}
