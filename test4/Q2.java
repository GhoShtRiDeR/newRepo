package test4;

//	Write a java program to find numbers between 100 and 400 (both included) where each digit of a number is an even number.

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int number = 100; number <= 400; number++) {
			int temp = number;
			int dig;
			while (temp > 0) {
				dig = temp % 10;
				if (dig % 2 == 1) {
					break;
				}
				temp = temp / 10;

			}
			if (temp == 0) {
				System.out.print(number + " ");
			}
		}
	}

}
