package com.day11;

public class GetterSetterMethod {
	private long accNo;
	private String name;
	private float balance;

	public long getAccNo() {

		return accNo;
	}

	public String getName() {

		return name;
	}

	public float getBalance() {

		return balance;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public void setName(String s) {
		name = s;
	}

	public void setBalance(float bal) {
		balance = bal;
	}
	
	public void acceptAccountDetails(long no,String naam,float bal) {
		
		accNo=no;
		name=naam;
		balance=bal;
		
	}
}
