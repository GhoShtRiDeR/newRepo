package test7;

import java.util.Arrays;

/*
 * Array  is        a     two   dimensional array as   follows.
   Arr = { { 1,2,3,4} , {5,6,7,8}}
Create a new array ArrCopy which should be as follows
 ArrCopy = {{4,3,2,1} , { 8,7,6,5}

 */
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]={
				{1,2,3,4},
				{5,6,7,8}
				};
		int[][] arrcopy= new int[2][4];
		for(int i=0;i<arrcopy.length;i++) {
			for(int j=arrcopy[i].length-1;j>=0;j--) {
				arrcopy[i][j]=arr[i][3-j];
			}
		}
		for(int i=0;i<arrcopy.length;i++) {
			for(int k=0;k<arrcopy[i].length;k++) {
				System.out.print(arrcopy[i][k]+" ");
			}
			System.out.println();
		}
	}

}
