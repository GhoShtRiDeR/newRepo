package com.day7;

import java.util.Scanner;

public class SimpleCalci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2=sc.nextInt();
		
		char ch;
		do
		{
			System.out.println("Enter 1.Addition\n2.Substraction\n3.Division\n4.Multiplication\n5.Modulo");
			int input=sc.nextInt();
			switch(input)
			{
			case 1:
				System.out.println(num1+num2);
				break;
			case 2:
				System.out.println(num1-num2);
				break;
			case 3:
				System.out.println("Quotient: "+num1/num2);
				break;
			case 4:
				System.out.println(num1*num2);
				break;
			case 5:
				System.out.println("Remainder: "+num1%num2);
				break;
			default:
				System.out.println("Invalid Input");
			}
			System.out.println("Do you want to continue............");
			ch=sc.next().charAt(0);
			
		}while(ch=='y'||ch=='Y');
	}

}
