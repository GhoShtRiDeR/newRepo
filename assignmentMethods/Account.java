package assignmentMethods;

public class Account {

	int acc_no;
	String name;
	double amount, balance;

	void insert(int acc_no, String name, double balance) {
		this.acc_no = acc_no;
		this.name = name;
		this.balance = balance;
	}

	void display() {
		System.out.println("Account No. :- " + acc_no + "| Name:- " + name);
	}

	void deposit(int amount) {
		this.balance += amount;
		display();
		System.out.println("Deposit of Rs" + amount + " is successful.\nCurrent Balance :- "+balance);
		
	}

	void withdraw(int amount) {
		this.amount = amount;
		display();
		if (checkBalance()) {
			this.balance -= amount;
			System.out.println("Withdrawal of Rs" + amount + " is successful.\nCurrent balance :-" + balance);
		}
		else
			System.out.println("Withdrawal of Rs" + amount + " is unsuccessful due to insufficient balance.\nCurrent balance :-" + balance);
		
	}

	boolean checkBalance() {
		if (balance < amount)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) {
		Account obj = new Account();
		obj.insert(301010254,"Sabita Ghosh", 50000.0);
		obj.deposit(5000);
		obj.withdraw(30000);
	}
	
	
	

}
