package BankTransactionProcess;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Balance b = new Balance();//Object
		int count=0;
		pqr:
		while(true) {
			System.out.println("Enter the PIN Number:- ");
			int pNo=s.nextInt();
			CheckPIN cp=new CheckPIN();//Object
			boolean k = cp.verify(pNo);
			if(k) {
				System.out.println("====Choice====");
				System.out.println("1.WithDraw\n2.Deposit");
				System.out.println("Enter the Choice:");
				int choice = s.nextInt();
				switch(choice)
				{
				case 1:
				System.out.println("Enter the amt:");
				int a1 = s.nextInt();
				if(a1>0 && a1%100==0)
				{
				Withdraw wd = new Withdraw();//Object
				wd.wDraw(a1,b);
				}//end of if
				else
				{
					System.out.println("Invalid Amt");
				}
				break;
				case 2:
					System.out.println("Enter the amt:");
					int a2 = s.nextInt();
					if(a2>0 && a2%100==0)
					{
					Deposit dp = new Deposit();//Object
					dp.deposit(a2,b);//method_call
					}//end of if
					else
					{
						System.out.println("Invalid amt...");
					}
					break pqr;//stop the while
					
				default:
					System.out.println("Invlaid Choice...");
					break pqr;//stop the while
					}//end of switch
					}//end of if
			else {
				System.out.println("Invalid PIN no");
				count++;
		}
			if(count==3) {
				System.out.println("Sorry! Card transaction blocked.");
				break;
			}
		}
		
	}

}
