package com.day3;

import java.util.Scanner;

public class GreatestNumberByTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,greatest;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 2 integer values: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		greatest=(num1>num2)?num1:num2;
		System.out.println("Greatest number: "+greatest);

	}

}
