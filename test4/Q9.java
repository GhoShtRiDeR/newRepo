package test4;

import java.util.Scanner;

public class Q9 {

	double calculateCommission(int sales) {

		double commission = (sales > 2000) ? (sales * 5 / 100) : (0.0);
		return commission;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sales: ");
		int sales = sc.nextInt();
		double comission;

		Q9 obj = new Q9();
		comission = obj.calculateCommission(sales);
		System.out.println(comission);

	}

}
