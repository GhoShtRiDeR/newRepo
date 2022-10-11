package test7;

import java.util.Scanner;

/*
 * WAP to print maximum in row-wise in 2D array. 
 * Means e.g. arr[][] {{22, 31, 9}, {12, 25, 16}}
 * output is: 31 and 25.
 */
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows of 2D array: ");
		int rows=sc.nextInt();
		System.out.println("Enter number of columns of 2D array: ");
		int columns=sc.nextInt();
		int[] max = new int[rows];
		int[][] array= new int[rows][columns];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				array[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(array[i][j]>max[i]) {
					max[i]=array[i][j];
				}	
			}
			System.out.print(max[i]+",");
		}
	}

}
