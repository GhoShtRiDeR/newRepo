package assignmentMethods;

import java.util.Scanner;

public class Cube {
double answer;
	
	double cube(double x) {
		answer=x*x*x;
		return answer;
	}

	void cube(int x) {
		answer=x*x*x;
		System.out.println(x+" squared = "+(int)answer);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		Cube volume =new Cube();
		volume.cube(number);

	}

}
