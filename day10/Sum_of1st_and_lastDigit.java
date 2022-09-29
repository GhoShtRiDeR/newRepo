package com.day10;

import java.util.Scanner;

public class Sum_of1st_and_lastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int sum,i=num;
		int firstDigit=num%10;
		while(i>10)
		{
			i=i/10;
		}
		int lastDigit=i;
		sum=firstDigit+lastDigit;
		System.out.println(sum);
	}
}


