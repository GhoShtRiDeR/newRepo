package com.day4;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Circle\n2.Rectangle\n3.triangle\n4.Square");
		System.out.println("Select a shape.");
		byte input=sc.nextByte();
		float area;
		switch(input)
		{
		case 1:
			System.out.println("Enter the radius of circle: ");
			byte radius=sc.nextByte();
			area=radius*radius*3.14f;
			System.out.println("Area:"+area);
			break;
		case 2:
			System.out.println("Enter the length of rectangle:");
			int length=sc.nextInt();
			System.out.println("Enter the breadth of rectangle:");
			int breadth=sc.nextInt();
			area=length*breadth;
			System.out.println("Area:"+area);
			break;
		case 3:
			System.out.println("Enter the base of triangle:");
			int base=sc.nextInt();
			System.out.println("Enter the height of triangle:");
			int height=sc.nextInt();
			area=height*base*0.5f;
			System.out.println("Area:"+area);
			break;
		case 4:
			System.out.println("Enter side length of square: ");
			int side=sc.nextInt();
			area=(float)side*side;
			System.out.println("Area:"+area);
			break;
		default:
			System.out.println("Invalid Input");	
		

	}
	}
}
