package test6;

import java.util.Arrays;
import java.util.Scanner;

/*Write a  program to remove duplicate elements from an array?
Array With Duplicates : [4, 3, 2, 4, 9, 2]
Array Without Duplicates : [4, 3, 2, 9]*/

public class RemoveDuplicateElements {
	
	public static void scanArray(int[] arr) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer elements of 1D array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public static int lengthWithoutDuplicates(int[] a) {
		int len=a.length;
		int visited = -1;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=visited) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && a[j]!=visited) {
					a[i]=visited;
					len--;
				}
			}
			}
		}
		return len;
	}

	public static void removeDuplicate(int[] a,int[] b) {
		int visited = -1;
		int k=0;
		while(k<b.length) {
		for(int i=0;i<a.length;i++) {
			if(a[i]!=visited) {
				b[k++]=a[i];
			}
		}
		}
	}

	public static void main(String[] args) {
		
		int[] input,output;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of input: ");
		int length = scan.nextInt();
		input =new int[length];
		scanArray(input);
		
		int bLength=lengthWithoutDuplicates(input);
		
		output = new int[bLength];
		
		
		removeDuplicate(input,output);
		System.out.println(Arrays.toString(output));

	}

}
