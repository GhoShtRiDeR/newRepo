package com.day3;

import java.util.Scanner;

public class DivisibleBy3and9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		
		if(num%3==0) {
			if(num%9==0)
				System.out.println("Divisible by 3 and 9.");
			else
				System.out.println("Divisible by 3 and not divisible by 9.");
		}
		else
			System.out.println("Not divisible by 3 and 9.");
		
	}

}
