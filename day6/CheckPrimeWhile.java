package com.day6;

import java.util.Scanner;

public class CheckPrimeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check prime or not: ");
		int num=sc.nextInt();
		int i=2;
		boolean isPrime=false;
		while(i<=num/2) 
		{
			if(num%i==0)
			{
			isPrime=true;
			break;
			}
			i++;
		}
		if(isPrime)
			System.out.print(num+" is not a prime number.");
		else
			System.out.print(num+" is a prime number.");

	}

}
