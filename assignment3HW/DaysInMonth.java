package assignment3HW;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of a month: ");
		String month=sc.next();
		
		if(month=="january"||month == "march"||month=="may"||month=="july"||month=="august"||month=="october"||month=="decenber")
			System.out.println("31 days");
		
		else if(month=="april"||month=="june"||month=="september"||month=="november")
			System.out.println("30 days");
		
		else if(month=="february")
			System.out.println("28 or 29 days");
		else
			System.out.println("Enter valid month or check whether all the letters of the word are small case.");

	}

}
