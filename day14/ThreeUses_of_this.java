package com.day14;

class StudentDetails {

	
	int math, chemistry, physics;
	String name;
	double percent;
	String schoolName;
	long studentId;
	private String favSubject;
	
	public void setFavSubject(String favSubject) {
		this.favSubject = favSubject;
	}

	public String getFavSubject() {
		return favSubject;
	}
	
	StudentDetails() {
		this("Nivedita","Saraswati Vidyalaya",1009876,98,87,81);
		displayStudentMarksheet();
	}

	
	StudentDetails(String name, String schoolName, long studentId, int math, int chemistry, int physics) {
		
		this.studentId = studentId;
		this.math = math;
		this.chemistry = chemistry;
		this.physics = physics;
		this.schoolName = schoolName;
		percentage();
		
	}

	double percentage() {
		percent = (math + chemistry + physics) / 3.0;
		return percent;
	}

	public void displayStudentMarksheet() {
		System.out.println("=====Student Marksheet=====");
		System.out.println("Name:- " + name);
		System.out.println("School:- " + schoolName);
		System.out.println("Student Id:- " + studentId);
		System.out.println("Math marks (out of 100):- " + math);
		System.out.println("Chemistry marks(out of 100):- " + chemistry);
		System.out.println("Physics marks(out of 100):- " + physics);
		System.out.println("Percentage:- " + percent);
	}

	 void displayStudentProfile() {
		System.out.println("=============" + this.name + "=============");
		System.out.println("School:- " + this.schoolName);
		System.out.println("Student Id:- " + this.studentId);
		System.out.println("Favourite Subject:- " + getFavSubject());
		System.out.println("PCM Percentage:- " + this.percent);
	}

public class ThreeUses_of_this {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails jeet = new StudentDetails("Jeet","Mount Carmel Convent",14007665L,85,67,71);
		
		StudentDetails nivi = new StudentDetails();
		nivi.setFavSubject("Math");
		nivi.displayStudentProfile();
		

	}
}
}
