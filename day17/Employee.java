package com.day17;

class Department {

	private int dId;
	private String dName;

	public int getDId() {
		return dId;
	}

	public String getDName() {
		return dName;
	}

	public void setDId(int dId) {
		this.dId = dId;
	}

	public void setDName(String dName) {
		this.dName = dName;
	}
}

public class Employee {

	private int id, salary;
	private String eName;
	private Department dept;

	public void setId(int id) {
		this.id = id;
	}

	public void setEName(String eName) {
		this.eName = eName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public String getEName() {
		return eName;
	}

	public int getSalary() {
		return salary;
	}

	public Department getDept() {
		return dept;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
