package assignment2HW;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double celsius,fahrenheit;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Temperature in Celsius: ");
		celsius=sc.nextDouble();
		
		fahrenheit=(celsius*9/5.0)+32;
		
		System.out.println("Temperature in Fahrenheit: "+fahrenheit);
		
		
		
	}

}
