package StringSessions;

import java.util.Scanner;

public class Q6 {
	static void checkPalindrome(String original) {
		String reverse="";
		for(int i=0;i<original.length();i++) {
			reverse=reverse+original.charAt(original.length()-1-i);
		}
		
		if(original.equals(reverse))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word to be checked for palindrome:- ");
		String input = sc.next();
		checkPalindrome(input);
	}

}
