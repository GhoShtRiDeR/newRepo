package com.day15;

import java.util.Scanner;

public class Arithmatic {
	char input;
	
	Arithmatic(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:- ");
		int num1=sc.nextInt();
		System.out.println("Enter second number:- ");
		int num2=sc.nextInt();
		System.out.println("Enter the operation to be performed(+,-,*,/,%):-");
		input=sc.next().charAt(0);
		calculate(num1,num2,input);
	}
	
	 void calculate(int x,int y,char input) {
		 
		 switch(input)
			{
			case '+':
				System.out.println(x+y);
				break;
			case '-':
				System.out.println(x-y);
				break;
			case '/':
				System.out.println("Quotient: "+x/y);
				break;
			case '*':
				System.out.println(x*y);
				break;
			case '%':
				System.out.println("Remainder: "+x%y);
				break;
			default:
				System.out.println("Invalid Input");
			}
	 }
	 void calculate(double x,int y,char input) {
		
		 switch(input)
			{
			case '+':
				System.out.println(x+y);
				break;
			case '-':
				System.out.println(x-y);
				break;
			case '/':
				System.out.println("Quotient: "+x/y);
				break;
			case '*':
				System.out.println(x*y);
				break;
			case '%':
				System.out.println("Remainder: "+x%y);
				break;
			default:
				System.out.println("Invalid Input");
			}
	 }
	 void calculate(int x,double y,char input) {
		 
		 switch(input)
			{
			case '+':
				System.out.println(x+y);
				break;
			case '-':
				System.out.println(x-y);
				break;
			case '/':
				System.out.println("Quotient: "+x/y);
				break;
			case '*':
				System.out.println(x*y);
				break;
			case '%':
				System.out.println("Remainder: "+x%y);
				break;
			default:
				System.out.println("Invalid Input");
			}
	 }
	 void calculate(double x,double y,char input) {
		 
		 switch(input)
			{
			case '+':
				System.out.println(x+y);
				break;
			case '-':
				System.out.println(x-y);
				break;
			case '/':
				System.out.println("Quotient: "+x/y);
				break;
			case '*':
				System.out.println(x*y);
				break;
			case '%':
				System.out.println("Remainder: "+x%y);
				break;
			default:
				System.out.println("Invalid Input");
			}
	 }
	 void calculate(long x,long y,char input) {
		 
		 switch(input)
			{
			case '+':
				System.out.println(x+y);
				break;
			case '-':
				System.out.println(x-y);
				break;
			case '/':
				System.out.println("Quotient: "+x/y);
				break;
			case '*':
				System.out.println(x*y);
				break;
			case '%':
				System.out.println("Remainder: "+x%y);
				break;
			default:
				System.out.println("Invalid Input");
			}
	 }
	 void calculate(double x,long y,char input) {
		 
		 switch(input)
			{
			case '+':
				System.out.println(x+y);
				break;
			case '-':
				System.out.println(x-y);
				break;
			case '/':
				System.out.println("Quotient: "+x/y);
				break;
			case '*':
				System.out.println(x*y);
				break;
			case '%':
				System.out.println("Remainder: "+x%y);
				break;
			default:
				System.out.println("Invalid Input");
			}
	 }
	 void calculate(long x,double y,char input) {
		 
		 switch(input)
			{
			case '+':
				System.out.println(x+y);
				break;
			case '-':
				System.out.println(x-y);
				break;
			case '/':
				System.out.println("Quotient: "+x/y);
				break;
			case '*':
				System.out.println(x*y);
				break;
			case '%':
				System.out.println("Remainder: "+x%y);
				break;
			default:
				System.out.println("Invalid Input");
			}
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmatic ob=new Arithmatic();
		ob.calculate(9.987, 0.76, '+');
		
	}

}
