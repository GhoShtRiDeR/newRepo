package BankTransactionProcess;

public class Withdraw {
	void wDraw(int amt,Balance b)
	{
	if(amt<b.bal)
	{
	System.out.println("Amt WithDrawn:"+amt);
	b.bal=b.bal-amt;
	b.getBalance();
	System.out.println("Transaction Completed...");
	}//end of if
	else
	{
	System.out.println("InSufficient Fund...");
	}
	}
}
