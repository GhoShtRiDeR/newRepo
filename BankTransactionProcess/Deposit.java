package BankTransactionProcess;

public class Deposit {
	void deposit(int amt, Balance b) {
		System.out.println("Amt deposited:" + amt);
		b.bal = b.bal + amt;
		b.getBalance();
		System.out.println("Transaction completed...");

	}
}
