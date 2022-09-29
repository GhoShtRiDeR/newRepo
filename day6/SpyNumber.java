package com.day6;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int n=num;
		int sum=0,product=1;
		while(n>0)
		{
			int no=n%10;
			sum=sum+no;
			product=product*no;
			n=n/10;
		}
		if(product==sum)
			System.out.println(num+" is a Spy number.");
		else
			System.out.println(num+" is not a Spy number.");
		
		

	}

}
