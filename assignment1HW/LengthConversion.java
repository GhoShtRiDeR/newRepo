package assignment1HW;

import java.util.Scanner;

public class LengthConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cms;
		float m,km;
		
		Scanner board=new Scanner(System.in);
		
		System.out.println("Enter a length value in centimeters: ");
		cms=board.nextInt();
		
		m=cms/100f;
		km=cms/1000f;
		
		System.out.println(cms+"cm = "+m+"m = "+km+"kms.");
		

	}

}
