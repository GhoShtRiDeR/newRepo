package com.day6;

import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int num=n;
		int reverse=0;
		
		while(num>0)
		{
			int no=num%10;
			reverse=reverse*10+no;
			num=num/10;
		}
		if(reverse==n)
			System.out.println(reverse+" is a palindrome number.");
		else
			System.out.println(reverse+" is not a Palindrome number.");

	}

}
