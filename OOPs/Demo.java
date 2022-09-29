package com.OOPs;

//In same Package
public class Demo {

	public static void main(String[] s) {
		StudentDetails sd = new StudentDetails();
		// sd.favSubject="Physics";//Private Variable
		sd.id = 14009876;
		sd.schoolName = "Carmel Academy";
		sd.setName("Himanshu Joshi");
		sd.setFavSubject("Physics");// setter method for initialising private variable
		// System.out.println("Name:- "+sd.name+"\nSchool:- "+sd.schoolName+"\nRoll no.
		// :- "+sd.id+"\nFavorite Subject:- "+sd.getFavSubject());
		sd.acceptStudentDetails(sd.getName(), sd.schoolName, sd.id, 72, 75, 85);// protected method
		sd.displayStudentMarksheet();// public method
		sd.percentage();// default method(visibility inside package)
		// sd.displayStudentProfile();Private Method
	}
}