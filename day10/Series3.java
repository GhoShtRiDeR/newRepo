package com.day10;

import java.util.Scanner;

public class Series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int terms=sc.nextInt();
		for(int i=1;i<=terms;i++)
		{
			System.out.print(" "+(i*i*i));
		}

	}

}
