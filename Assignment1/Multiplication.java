package Assignment1;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1,num2,result;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 2 numbers to be multiplied: ");
		num1=sc.nextFloat();
		num2=sc.nextFloat();
		
		result=num1*num2;
		System.out.println(result);
	}

}
