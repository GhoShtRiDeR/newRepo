package com.OOPs;

public class MethodDemo {
	
	private double price=56.8,PI=3.14;
	
	//1. No return_type no parameter
	public void show()
	{
		System.out.println("YoYo");
	}
	//2. No return_type with parameter
	public void addition(double c,double d)
	{
		System.out.println("Sum:- "+(c+d));
	}
	//3. with return type without parameters
	double showPrice()
	{
		return price;
	}
	//4. with return_type with parameters
	public double circleArea(double r)
	{
		double area = r*r*PI;
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo m=new MethodDemo();
		System.out.println("Hello");
		m.show();
		System.out.println("HI");
		System.out.println("================ ");
		m.addition(3.14, 7.89);
		System.out.println("================ ");
		System.out.println("Price:- "+m.price);
		System.out.println("================ ");
		System.out.println("Area of circle:- "+m.circleArea(6.67));
		System.out.println("================ ");
	}

}
