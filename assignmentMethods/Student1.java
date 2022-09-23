package assignmentMethods;

public class Student1 {
	
	long id;
	int math, chemistry, physics;
	String name;
	double percent;
	String schoolName;
	
	
	double percentage() {
		percent = (math + chemistry + physics) / 3.0;
		return percent;
	}
	
	public void acceptStudentDetails(String naam, String school, long StudentId, int maths, int chem, int phy) {
		name=naam;
		id = StudentId;
		math = maths;
		chemistry = chem;
		physics = phy;
		schoolName = school;

	}
	
	public void displayStudentMarksheet() {
		System.out.println("=====Student Marksheet=====");
		System.out.println("Name:- " + name);
		System.out.println("School:- " + schoolName);
		System.out.println("Student Id:- " + id);
		System.out.println("Percentage:- " + percent);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 emma=new Student1();
		emma.acceptStudentDetails("Emma Stone", "Cocopah Middle School", 17671323, 67, 87,72);
		emma.percentage();
		emma.displayStudentMarksheet();
	}

}
