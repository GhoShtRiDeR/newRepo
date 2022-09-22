package Assignment1;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,quotient,remainder;
		
		Scanner key =new Scanner(System.in);
		
		System.out.println("Enter the two numbers to be divided: ");
		num1=key.nextInt();
		num2=key.nextInt();
		
		quotient=num1/num2;
		remainder=num1%num2;
		
		System.out.println("Quotient: "+quotient+" and Remainder: "+remainder);
		

	}

}
