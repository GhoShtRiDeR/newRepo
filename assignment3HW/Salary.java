package assignment3HW;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary: ");
		float basic=sc.nextInt();
		float gross,hra,da;
		if(basic<10000)
		{
			hra= basic*0.2f;
			da=basic*0.8f;
			gross = hra+da+basic;
		}
		else if(basic>=10000 && basic<20000)
		{
			hra=basic*0.25f;
			da=basic*0.9f;
			gross = hra+da+basic;
		}
		else
		{
			hra=basic*0.3f;
			da=basic*0.95f;
			gross = hra+da+basic;
		}
		System.out.println("Gross salary = "+gross);
		

	}

}
