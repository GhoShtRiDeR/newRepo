package com.OOPs;

public class StudentDetails {

	long id;
	int math, chemistry, physics;
	private String name;
	double percent;
	public String schoolName;
	private String favSubject;

	public void setFavSubject(String favSubject) {
		this.favSubject = favSubject;
	}

	public String getFavSubject() {
		return favSubject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setId(long studentId) {
		id=studentId;
	}
	public long getId() {
		return id;
	}

	protected void acceptStudentDetails(String naam, String school, long StudentId, int maths, int chem, int phy) {
		setName(naam);
		id = StudentId;
		math = maths;
		chemistry = chem;
		physics = phy;
		schoolName = school;

	}

	double percentage() {
		percent = (math + chemistry + physics) / 3.0;
		return percent;
	}

	public void displayStudentMarksheet() {
		System.out.println("=====Student Marksheet=====");
		System.out.println("Name:- " + getName());
		System.out.println("School:- " + schoolName);
		System.out.println("Student Id:- " + id);
		System.out.println("Math marks (out of 100):- " + math);
		System.out.println("Chemistry marks(out of 100):- " + chemistry);
		System.out.println("Physics marks(out of 100):- " + physics);
		System.out.println("Percentage:- " + percent);
	}

	private void displayStudentProfile() {
		System.out.println("=============" + getName() + "=============");
		System.out.println("School:- " + schoolName);
		System.out.println("Student Id:- " + id);
		System.out.println("Favourite Subject:- " + favSubject);
		System.out.println("PCM Percentage:- " + percent);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails ob = new StudentDetails();
		ob.acceptStudentDetails(" Jeet Jyoti Ghosh ", "Mount Carmel Convent High School", 14007665, 85, 65, 71);
		ob.percentage();
		// ob.displayStudentMarksheet();
		ob.displayStudentProfile();

	}

}
