package com.day4;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter first number: ");
		num1=sc.nextInt();
		System.out.println("Enter Second number: ");
		num2=sc.nextInt();
		System.out.println("Enter a Symbol from +,-,/,*,%");
		char input=sc.next().charAt(0);
		switch(input)
		{
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '/':
			System.out.println("Quotient: "+num1/num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '%':
			System.out.println("Remainder: "+num1%num2);
			break;
		default:
			System.out.println("Invalid Input");
		}

	}

}
