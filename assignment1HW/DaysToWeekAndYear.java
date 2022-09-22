package assignment1HW;

import java.util.Scanner;

public class DaysToWeekAndYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day;
		float week,year;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Days= ");
		day=sc.nextInt();
		
		week=day/7f;
		year=day/365.25f;//including leap year in every 4 years
		
		System.out.println(day+"days = "+week+" weeks and "+year+" years.");
		
	}

}
