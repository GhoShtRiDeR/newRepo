package test7;

import java.util.*;

public class Q1 {
	
	void alternateMerge(int a[],int b[],int c[]) {
		int aLength=a.length;
		int bLength=b.length;
		
		int i=0,j=0,k=0;
		while(i<aLength && j<bLength) {
			c[k++]=a[i++];
			c[k++]=b[j++];
		}
		
		while(i<aLength) {
			c[k++]=a[i++];
		}
		
		while(j<bLength) {
			c[k++]=b[j++];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int[] arr1=new int[8];
		int[] arr2=new int[4];
		int output_length = arr1.length + arr2.length;
		int[] output = new int[output_length];	
		
		System.out.println("Enter elements of array1: ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter elements of array2: ");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=scan.nextInt();
		}
		
		Q1 obj=new Q1();
		obj.alternateMerge(arr1, arr2, output);
			
		
		System.out.println(Arrays.toString(output));
	}

}
