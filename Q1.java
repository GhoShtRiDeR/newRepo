package StringSessions;

import java.util.Scanner;

class Q1 {
	
	void pattern(String s) {
		String[] s1=s.split("\\s");
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(s1[j]+"\s");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input=scan.nextLine();
		Q1 pat=new Q1();
		pat.pattern(input);
	}

}
