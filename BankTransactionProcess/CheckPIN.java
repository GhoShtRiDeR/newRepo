package BankTransactionProcess;

public class CheckPIN {
	boolean k=false;
	boolean verify(int pinNo)
	{
	if(pinNo==1406 || pinNo==6041 || pinNo==2008)
	{
	k=true;
	}
	return k;
	}
}
