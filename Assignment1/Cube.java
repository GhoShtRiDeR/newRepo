package Assignment1;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num,cube;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to find it's cube: ");
		num=sc.nextFloat();
		
		cube=num*num*num;
		System.out.println("Square of "+num+" ="+cube);


	}

}
