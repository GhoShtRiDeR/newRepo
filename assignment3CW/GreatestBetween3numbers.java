package assignment3CW;

import java.util.Scanner;

public class GreatestBetween3numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,greatest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		greatest = (num1>num2)?(num1>num3)?num1:num3:(num2>num3)?num2:num3;
		System.out.println("Greatest number: "+greatest);

	}

}
