package com.day12;

import com.OOPs.StudentDetails;

public class Student {

	public static void main(String[] args) {
		StudentDetails st = new StudentDetails();
		st.schoolName = "Vidya Vihar";
		st.setFavSubject("Geography.");// setter method for initializing private variable
		st.setName("Chaitanya");// setter method for protected variable
		st.setId(14019845);//setter method for default variable
		System.out.println("Name:- " + st.getName() + "\nSchool:- " + st.schoolName + "\nRoll no.:- " + st.getId()
				+ "\nFavorite Subject:- " + st.getFavSubject());
		// st.acceptStudentDetails(st.getName(), st.schoolName,st.getId(), 73, 81, 65);
		// protected method
		st.displayStudentMarksheet();// public method
		// st.percentage(); default method(visibility inside package)
		// sd.displayStudentProfile();Private Method

	}

}
