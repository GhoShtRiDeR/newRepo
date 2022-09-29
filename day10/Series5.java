package com.day10;

import java.util.Scanner;

public class Series5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int terms=sc.nextInt();
		for(int i=1;i<=2*terms;i++)
		{
			if(i%2==1)
			{
			System.out.print(" "+(i*i));
			}
		}
	}

}
