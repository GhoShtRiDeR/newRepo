package Assignment1;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,sum;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 2 numbers to find their sum: " );
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		sum=num1+num2;
		System.out.println("Sum: "+sum);
	}

}
