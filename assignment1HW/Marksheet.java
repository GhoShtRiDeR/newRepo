package assignment1HW;

import java.util.Scanner;

public class Marksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int math,english,totalMarks,science,hindi,sST;
		float avg,percent;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks in English: ");
		english=sc.nextInt();
		
		System.out.println("Enter marks in Maths: ");
		math=sc.nextInt();
		
		System.out.println("Enter marks in Hindi: ");
		hindi=sc.nextInt();
		
		System.out.println("Enter marks in Science: ");
		science=sc.nextInt();
		
		System.out.println("Enter marks in Social Science: ");
		sST=sc.nextInt();
		
		totalMarks=english+math+science+hindi+sST;
		
		avg=totalMarks/5f;
		percent=totalMarks/5f;
		
		System.out.println("Total marks out of 500: "+totalMarks);
		System.out.println("Average marks per Subject: "+avg);
		System.out.println("Percentage: "+percent+"%");
		
	}

}
