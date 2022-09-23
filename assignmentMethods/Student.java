package assignmentMethods;

public class Student {
	int studentID;
	String name;
	int getStudentID(int iD) {
		studentID=iD;
		return studentID;
	}
	
	void setCustomData(int customId, String customName) {
		studentID=customId;
		name=customName;
		
	}
	
	void displayData() {
		studentID=14001234;
		name="xyz";
		getStudentID(14007675);
		System.out.println("-------------------------------------------------------- ");
		System.out.println("Student ID:- "+studentID+"| Name:- "+name);
		System.out.println("-------------------------------------------------------- ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student troy=new Student();
		troy.displayData();
		troy.setCustomData(14007665, "Jeet Jyoti Ghosh");		
		System.out.println("Student ID:- "+troy.studentID+"| Name:- "+troy.name);
		
		Student dhanno =new Student();
		dhanno.setCustomData(14002648, "Dhananjay Kshirsagar");
		System.out.println(dhanno.hashCode());
		System.out.println("Student ID:- "+dhanno.studentID+"| Name:- "+dhanno.name);

	}

	

}
