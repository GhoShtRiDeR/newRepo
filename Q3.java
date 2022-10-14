package StringSessions;

import java.util.Scanner;

class Q3 {
	String[] linear = { "a+1", "b+2", "c+3", "d+4", "e+5" };

	// will work only for the above string type array.
	void leen(char linear) {
		int count = 0;
		for (int i = 0; i < this.linear.length; i++) {
			char[] ch = this.linear[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (linear == ch[j]) {
					System.out.println(ch[ch.length - 1]);
					count++;
					break;
				}
			}
		}
		if (count == 0) {
			System.out.println("Invalid input.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char ch = input.charAt(0);
		Q3 obj = new Q3();
		obj.leen(ch);
	}

}
