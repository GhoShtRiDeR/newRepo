package test6;

/*
 * Write a program to find Minimum frequency char from an Array
e.g char arr[]={‘a’,’b’,’b’,’c’,’c’,’b’};
output= a
*/

import java.util.Scanner;

public class MinFrequencyChar {

	public static void minFreqChar(char[] a) {
		char visited = '_';
		int min = 10;
		int[] freq = new int[a.length];
		//traverse the array and find the count of each unique character in the array
		for (int o = 0; o < a.length; o++) {
			int count = 1;
			if (a[o] != visited) {
				for (int i = o + 1; i < a.length; i++) {
					if (a[o] == a[i] && a[i] != visited) {
						a[i] = visited;
						count++;
					}
				}
				freq[o] = count;
			}

		}
		// identify the index of array with minimum count of character
		for (int i = 0; i < freq.length; i++) {
			if (min > freq[i] && freq[i] != 0) {
				min = freq[i];
			}
		}
		// print the least occurring character(s) 
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == min) {
				System.out.print(a[i] + " ");
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array required: ");
		int length = sc.nextInt();
		char[] input = new char[length];
		System.out.println("Enter character elements for the input array: ");
		for(int i=0;i<input.length;i++) {
			input[i]=sc.next().charAt(0);
		}
		minFreqChar(input);
		

	}

}
