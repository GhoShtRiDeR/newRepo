package assignmentMethods;

import java.util.Scanner;

public class Square {
	double answer;
	
	double square(double x) {
		answer=x*x;
		return answer;
	}

	void square(int x) {
		answer=x*x;
		System.out.println(x+" squared = "+(int)answer);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double number=sc.nextDouble();
		Square area=new Square();
		double x=area.square(number);
		System.out.println(x);
		area.square(98);
	}

}
