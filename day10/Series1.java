package com.day10;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int terms=sc.nextInt();
		int num=2,diff=3;
		System.out.print(num);
		
		for(int i=1;i<=terms;i++)
		{
			num=num+diff;
			System.out.print(" "+num);
			diff+=2;
		}
		
			

	}

}
