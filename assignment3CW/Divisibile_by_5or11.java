package assignment3CW;

import java.util.Scanner;

public class Divisibile_by_5or11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		if(num%5==0 && num%11==0)
			System.out.println("The number "+num+" is divisibe by 5 and 11.");
		else
			System.out.println(num+" is not divisible by 5 and 11.");

	}

}
