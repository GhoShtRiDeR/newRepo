package assignment1HW;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int principal,rate,timePeriod;
		float simpleInterest;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the principal amount(in Rs): ");
		principal=sc.nextInt();
		
		System.out.println("Enter the rate of interest(in %): ");
		rate=sc.nextInt();
		
		System.out.println("Enter the Time Period of interest(in years): ");
		timePeriod=sc.nextInt();
		
		simpleInterest=principal*rate*timePeriod/100;
		System.out.println("Interest(in Rs): "+simpleInterest);

	}

}
