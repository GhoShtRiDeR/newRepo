package test7;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int[] arr=new int[10];
		
		System.out.println("Enter elements of array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		int temp;
		for(int k=0;k<2;k++) {
			temp=arr[k];
			arr[k]=arr[arr.length-1-k];
			arr[arr.length-1-k]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
