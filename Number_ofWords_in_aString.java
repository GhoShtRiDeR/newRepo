package StringSessions;

import java.util.Scanner;

public class Number_ofWords_in_aString {
	int number_ofWords_inString(String s) {
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '\s') {
				if (i == 0 || i == s.length() - 1) {
					continue;
				} else if (s.charAt(i - 1) == '\s'||s.charAt(i+1)=='\s') {
					continue;
				}
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String input = sc.nextLine();
		Number_ofWords_in_aString obj = new Number_ofWords_in_aString();
		int frequency = obj.number_ofWords_inString(input);
		System.out.println("Number of words = " + frequency);
	}
}
