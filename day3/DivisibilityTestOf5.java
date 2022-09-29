package com.day3;

import java.util.Scanner;

public class DivisibilityTestOf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		if(num%5==0) 
			System.out.println("Entered number is divisible by 5.");
		else
			System.out.println("Entered number is not divisible by 5.");
	}

}
