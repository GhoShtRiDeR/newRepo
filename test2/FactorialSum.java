package test2;

import java.util.Scanner;

public class FactorialSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms to find out sum of factorial: ");
		int n = sc.nextInt();
		int sum = 0, fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
			sum = sum + fact;
		}
		System.out.println("Sum =" + sum);

	}

}
