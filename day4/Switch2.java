package com.day4;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word=sc.next();
		
		switch(word) {
		case "happy": System.out.println("Happy");
		break;
		
		case "new": System.out.println("New");
		break;
		
		case "year":System.out.println("Year");
		break;
		
		default:
			System.out.println("Welcome");
		}
		
	}

}
