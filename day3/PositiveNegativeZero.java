package com.day3;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		if(num==0)
			System.out.println("Entered number is zero.");
		else if(num>0)
			System.out.println("Entered number is positive.");
		else
			System.out.println("Entered number is negative.");

	}

}
