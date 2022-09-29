package com.day6;

import java.util.Scanner;

public class ReverseOfaNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int reverse=0;
		
		while(num>0)
		{
			int n=num%10;
			reverse=reverse*10+n;
			num=num/10;
		}
		System.out.println(reverse);
	}

}
