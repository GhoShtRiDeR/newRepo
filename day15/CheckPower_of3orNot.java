package com.day15;

import java.util.Scanner;

public class CheckPower_of3orNot {
		
	void powerOf3(int number) {
		int power =1;
		while(number>power) {
			power = power*3;
		}
		if(number==power)
		{
			System.out.println(number+" is a power of 3");
		}
		else
			System.out.println(number+" is not a power of 3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check whether that number is a power of 3 or not: ");
		int num=sc.nextInt();
		CheckPower_of3orNot obj=new CheckPower_of3orNot();
		obj.powerOf3(num);
	}

}
