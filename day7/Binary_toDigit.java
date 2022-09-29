package com.day7;

import java.util.Scanner;

public class Binary_toDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter to check for binary: ");
		long bin=sc.nextLong();
		long num=bin;
		int d,digit=0,count=0;
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
			count++;
		}
		if(flag==true)
		{
			System.out.print(num+" is a binary number. ");
			while(num>0)
			{
				for(int i=0;i<=count;i++)
				{
				d=(int)num%10;
				digit=digit + (int)Math.pow(2,i)*d;
				num=num/10;
				}
			}
			System.out.print(digit+" is the value of given binary.");
		}
		else
		{
			System.out.print(num+" is not a binary number. ");
		} 

	}

}
