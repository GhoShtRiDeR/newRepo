package test6;

import java.util.Arrays;
import java.util.Scanner;

/*Write a  program to separate zeros from non-zeros in an integer array?
Input Array : [12, 0, 7, 0, 8, 0, 3]
Input Array After moving zeros to end :
[12, 7, 8, 3, 0, 0, 0]*/

public class Separate0fromNonZero {

	static int[] arr;
	//Scanning array elements as input
	public static void scanArray(int arrayLength) {
		arr = new int[arrayLength];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer elements of 1D array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	//move zeros to the end of array
	public static void separatezeros(int[] a) {
		int lastIndex = a.length - 1;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == 0) {
				for (int j = lastIndex; j > i; j--) {
					if (a[j] != 0) {
						a[i] = a[j];
						a[j] = 0;
						break;
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of the array: ");
		int length = scan.nextInt();
		scanArray(length);
		separatezeros(arr);
		System.out.println(Arrays.toString(arr));

	}

}
