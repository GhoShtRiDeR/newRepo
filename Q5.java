package StringSessions;

import java.util.Scanner;

public class Q5 {

	static void frequency_ofWords_inString(String s) {
		String[] words = s.split("\\s");
		String visited = "+/";
		for (int i = 0; i < words.length; i++) {
			if (words[i] != visited) {
				int count = 1;
				for (int j = i + 1; j < words.length; j++) {

					if (words[i].equals(words[j])) {
						count++;
						words[j] = visited;
					}
				}
				System.out.println("Frequency of " + words[i] + " = " + count);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String aSentence = sc.nextLine();
		frequency_ofWords_inString(aSentence);

	}

}
