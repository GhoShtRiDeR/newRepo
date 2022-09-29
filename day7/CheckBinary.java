package com.day7;

import java.util.Scanner;

public class CheckBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter to check for binary: ");
		long bin=sc.nextLong();
		long num=bin;
		int d;
		boolean flag=true;
		while(bin>1)
		{
			d=(int)bin%10; 
			if(d>1)
			{
				flag=false;
				break;
			}
			bin=bin/10;
		}
		if(flag==true)
		{
			System.out.print(num+" is a binary number. ");
		}
		else
		{
			System.out.print(num+" is not a binary number. ");
		}
	}
	
}
