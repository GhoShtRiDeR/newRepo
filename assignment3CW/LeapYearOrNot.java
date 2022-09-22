package assignment3CW;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year to be checked: ");
		int year=sc.nextInt();
		
		if(year%4==0)
			System.out.println(year+" is a leap year.");
		else
			System.out.println(year+" is not a leap year.");
		
	}

}
