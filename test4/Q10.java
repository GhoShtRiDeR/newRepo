package test4;

import java.util.Scanner;

public class Q10 {
	void placeOfService(int age,char sex) {
		
		if(sex=='F'||sex=='f') {
			System.out.println("Place of Service:- Urban Areas only");
			if(age<20 ||age>60)
				System.out.println("Error");
		}
		else if(sex=='M'||sex=='m') {
			if(age>=20 && age<=40)
				System.out.println("Place of Service:- can be anywhere");
			else if(age>40 && age<=60)
				System.out.println("Place of Service:- Urban Areas only");
			else
				System.out.println("Error");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		
		System.out.println("Enter 'M' or 'm' for male and 'F' or 'f'  for female :");
		char sex=sc.next().charAt(0);
		
		System.out.println("Marital Status(Enter Y for married and N for unmarried): ");
		char maritalStatus=sc.next().charAt(0);
		
		Q10 obj=new Q10();
		obj.placeOfService(age, sex);
		
		
		
	}

}
