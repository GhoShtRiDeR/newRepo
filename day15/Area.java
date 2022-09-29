package com.day15;

public class Area {
	
	double pi=3.14;
	
	void area(double radius) {
		System.out.println("Area of circle = "+(radius*radius*pi));
	}
	void area(double base,double height) {
		System.out.println("Area of triangle = "+(base*height*0.5));
	}
	void area(int length,int breadth) {
		System.out.println("Area of rectangle = "+(length*breadth));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
