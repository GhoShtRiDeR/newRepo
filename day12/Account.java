package com.day12;

public class Account {
	public long accNum;
	public String accountType;
	private float balance;

	public float getBalance() {

		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void acceptAccountDetails(long no, String accType, float bal) {

		accNum = no;
		accountType = accType;
		balance = bal;

	}

	public void displayAccountDetails() {
		System.out.println("Account Number:- " + accNum);
		System.out.println("Account Type:- " + accountType);
		System.out.println("Balance:- " + balance);
	}

	public void deposit(int deposit) {
		balance = balance + deposit;
		System.out.println("Current Balance:- " + balance);
	}

	public void withdraw(int withdraw) {
		balance = balance - withdraw;
		System.out.println("Current Balance:- " + balance);
	}
}
