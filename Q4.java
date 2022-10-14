package StringSessions;

import java.util.Scanner;

public class Q4 {
	static boolean checkString_isNumeric(String s) {
		int count = 0;
		boolean say = true;
		for (int i = 0; i < s.length(); i++) {
			 if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				continue;
			} else {
				count++;
			}
			if (count > 0) {
				say = false;
				break;
			}
		}
		return say;
	}

	static void checkSum_ofFirst_andLast3Digits(String s) {
		if (checkString_isNumeric(s)) {
			int sumF = 0, sumL = 0;
			for (int i = 0; i < 3; i++) {
				char first = s.charAt(i);
				char last = s.charAt(s.length() - 1 - i);
				sumF = sumF + Character.getNumericValue(first);
				sumL = sumL + Character.getNumericValue(last);

			}
			if (sumF == sumL) {
				System.out.println("Valid String");
			} else
				System.out.println("Invalid String");
		} else {
			System.out.println("Invalid String");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a multiple digit number(more than 3 digits): ");
		String input = sc.nextLine();
		checkSum_ofFirst_andLast3Digits(input);

	}

}
