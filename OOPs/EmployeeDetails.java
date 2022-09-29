package com.OOPs;

public class EmployeeDetails {
	int empId, salary;
	String name;

	void acceptDetails(int id, String naam, int sal) {
		empId = id;
		name = naam;
		salary = sal;
	}

	void displayDetails() {

		System.out.println("Employee Id:- " + empId);
		System.out.println("Employee Name:- " + name);
		System.out.println("Annual Salary:- " + salary);
		System.out.println("================================ ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails ob = new EmployeeDetails();
		EmployeeDetails ob1 = new EmployeeDetails();
		ob.acceptDetails(101, "Nikhil", 800000);
		ob1.acceptDetails(102, "Neha", 700000);
		System.out.println("=====Employee Details===== ");
		ob.displayDetails();
		ob1.displayDetails();
	}

}
