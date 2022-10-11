package test7;

import java.util.Scanner;
//WAP to find frequency/count of each element in 1D array.
public class Q3 {
	
	int visited = -1;
	void countArrayElements(int a[],int freq[]) {
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited) {
				freq[i]=count;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int[] input=new int[8];
		int[] freq=new int[input.length];
		
		System.out.println("Enter the entements of an array: ");
		for(int i=0;i<input.length;i++) {
			input[i]=sc.nextInt();
		}
		Q3 obj = new Q3();
		obj.countArrayElements(input, freq);
		for(int i=0;i<input.length;i++) {
			if(freq[i]!=obj.visited) {
				System.out.println("The frequency of "+input[i]+" is "+freq[i]);
			}
		}
		

	}

}
