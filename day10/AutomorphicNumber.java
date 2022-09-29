package com.day10;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sq=num*num;
		if(num>10)
		{
		 if(num%100==sq%100)
			 System.out.println("Automorphic Number");
		 else
			 System.out.println("Not an Automorphic Number");
		}
	}

}
