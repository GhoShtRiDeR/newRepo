package com.day7;

import java.util.Scanner;

public class Do_while_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		float area;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Circle\n2.Rectangle\n3.triangle\n4.Square");
			System.out.println("Select a shape.");
			byte input=sc.nextByte();
		switch(input)
		{
		case 1:
			System.out.println("Enter the radius of circle: ");
			float radius=sc.nextFloat();
			area=radius*radius*3.14f;
			System.out.println("Area:"+area);
			break;
		case 2:
			System.out.println("Enter the length of rectangle:");
			float length=sc.nextFloat();
			System.out.println("Enter the breadth of rectangle:");
			float breadth=sc.nextFloat();
			area=length*breadth;
			System.out.println("Area:"+area);
			break;
		case 3:
			System.out.println("Enter the base of triangle:");
			float base=sc.nextFloat();
			System.out.println("Enter the height of triangle:");
			float height=sc.nextFloat();
			area=height*base*0.5f;
			System.out.println("Area:"+area);
			break;
		case 4:
			System.out.println("Enter side length of square: ");
			float side=sc.nextFloat();
			area=side*side;
			System.out.println("Area:"+area);
			break;
		default:
			System.out.println("Invalid Input");	
			}
		System.out.println("Do you want to continue............");
		ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}


