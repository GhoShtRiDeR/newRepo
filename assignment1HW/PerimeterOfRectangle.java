package assignment1HW;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float length,breadth,perimeter;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the length:");
		length=scan.nextFloat();
		
		System.out.println("Enter the Breadth: ");
		breadth=scan.nextFloat();
		
		perimeter=2*length+2*breadth;
		System.out.println("Perimeter of Rectangle: "+perimeter);
	}
	
}
