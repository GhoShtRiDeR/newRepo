package Assignment1;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float base,height,area;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of base of the triangle: ");
		base=sc.nextFloat();
		
		System.out.println("Enter the value of height of the triangle: ");
		height=sc.nextFloat();
		
		area=0.5f*base*height;
		System.out.println("Area of triangle: "+area);
	}

}
