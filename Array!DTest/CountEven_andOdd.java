package test6;

import java.util.Scanner;

//create a Array of integer and count the number of even  and odd elements from array.

public class CountEven_andOdd {

	private int evenCount, oddCount;
	int[] arr;

	public void scanArray(int arrayLength) {
		arr = new int[arrayLength];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer elements of 1D array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public int countEven(int[] arr) {
		evenCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			}
		}
		return evenCount;
	}

	public int countOdd(int[] arr) {
		oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				oddCount++;
			}
		}
		return oddCount;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements of 1D array: ");
		int length = scan.nextInt();
		CountEven_andOdd obj = new CountEven_andOdd();
		obj.scanArray(length);
		System.out.println("Even elements = " + obj.countEven(obj.arr));
		System.out.println("Odd elements = " + obj.countOdd(obj.arr));

	}

}
