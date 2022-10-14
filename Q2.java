package StringSessions;

import java.util.Scanner;

class Q2 {
	
	static void initials_withSurname(String str) {
		String[] s=str.split("\\s");
		System.out.print("Mr. ");
		for(int i=0;i<s.length;i++) {
			
			if(i<s.length-1) {
				System.out.print(s[i].toUpperCase().charAt(0)+".");
				continue;
			}
			System.out.print(s[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the full name: ");
		String name=sc.nextLine();
		initials_withSurname(name);
		
	}

}
