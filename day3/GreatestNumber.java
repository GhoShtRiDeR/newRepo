package com.day3;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 3 integer values: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		if(num1>num2) {
			if(num1>num3)
				System.out.println("Greatest number= "+num1);
			else
				System.out.println("Greatest number= "+num3);
		}
		else {
			if(num2>num3)
				System.out.println("Greatest number= "+num2);
			else
				System.out.println("Greatest number= "+num3);
		}
	}

}
