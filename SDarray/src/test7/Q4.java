package test7;

import java.util.*;

/*How to rearrange array in alternating positive and negative number[2]
Input: {1, 2, 3, -4, -1, 4}
Output: {-4, 1, -1, 2, 3, 4}
*/

public class Q4 {

	void rearrange(int a[]) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				if(i==j) {
					j+=2;
					continue;
				}
				int right, k;
				right = a[j];
				a[j] = a[i];

				for (k = i - 1; k > j; k--) {
					a[k + 1] = a[k];
				}
				a[j + 1] = right;
				j += 2;
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] array = new int[6];
		System.out.println("Enter elements of the array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		Q4 obj = new Q4();
		obj.rearrange(array);
		System.out.println(Arrays.toString(array));
	}

}
