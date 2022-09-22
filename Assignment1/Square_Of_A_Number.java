package Assignment1;

import java.util.Scanner;

public class Square_Of_A_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num,square;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to be sqaured: ");
		num=sc.nextFloat();
		
		square=num*num;
		System.out.println("Square of "+num+" = "+square);

	}

}
