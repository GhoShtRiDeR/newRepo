package assignment2HW;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius,fahrenheit;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Temperature in Fahrenheit: ");
		fahrenheit=sc.nextDouble();
		
		celsius=(fahrenheit-32)*5/9;
		
		System.out.println("Temperature in Celsius: "+celsius);

	}

}
