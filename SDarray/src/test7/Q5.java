package test7;

import java.util.Arrays;
import java.util.Scanner;

/*Write a java program to separate zeros from non-zeros in an integer array? 
Input Array : [12, 0, 7, 0, 8, 0, 3]
Output: [12, 7, 8, 3, 0, 0, 0]*/

public class Q5 {
	
	static void rearrange(int a[]) {
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[k]=a[i];
				k++;
			}
		}
		for(int i=k;i<a.length;i++) {
			a[k]=0;
			k++;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] array = new int[7];
		System.out.println("Enter elements of the array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		
		Q5.rearrange(array);
		
	}

}
