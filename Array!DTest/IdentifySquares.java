package test6;

import java.util.Scanner;

//WAP to display all perfect square number in array.
//Means e.g. arr[] = [23, 43, 25, 49, 12, 9, 78, 66, 39, 0] so output is 25, 49, 9

public class IdentifySquares {

	static int[] arr;

	public static void scanArray(int arrayLength) {
		arr = new int[arrayLength];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public static void identifySquares(int[] a) {
		
		

		for (int i = 0; i < a.length; i++) {
			if(a[i]==1) {
				System.out.print(a[i]+" ");
				continue;
			}
			for (int j = 1; j <= a[i] / 2; j++) {
				if (a[i] == j * j || a[i] == 1) {
					System.out.print(a[i]+" ");
					break;
				}
			}

		}
	}



	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of integer array: ");
		int length = scan.nextInt();
		scanArray(length);
		identifySquares(arr);

		

	}

}
