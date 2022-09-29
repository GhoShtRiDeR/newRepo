package com.day6;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int magic=68;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter a number as a guess: ");
			int num=sc.nextInt();
			if(num>magic)
			{
				System.out.println("Try a smaller value.");
			}
			else if(num<magic)
			{
				System.out.println("Try a larger value.");
				continue;
			}
			else
			{
				System.out.println("correct guess.");
				break;
			}
		}
	}

}
