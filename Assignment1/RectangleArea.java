package Assignment1;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float length,breadth,area;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the length:");
		length=scan.nextFloat();
		
		System.out.println("Enter the Breadth: ");
		breadth=scan.nextFloat();
		
		area=length*breadth;
		System.out.println("Area of Rectangle: "+area);
	}

}
