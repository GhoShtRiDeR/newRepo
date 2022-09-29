package com.day6;

import java.util.Scanner;

public class CheckPrime_using_counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int res;
		int counter = 0;
		
		for(int i=2;i<=num/2;i++)
		{
			res=num%i;
			
			if(res==0)
			{
				counter++;
				break;
			}
		}
		if(counter==0)
			System.out.println(num+" is a prime number. ");
		else
			System.out.println(num+" is not a prime number.");

	}

}
