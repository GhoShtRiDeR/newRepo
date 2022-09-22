package test3;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0,3,8,15,24,35,.......
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms: ");
		int terms = sc.nextInt();
		int initial=0,diff=3;
		System.out.println("Series: ");
		for(int i=1;i<=terms;i++) {
			System.out.print(initial+" ");
			initial=initial+diff;
			diff=diff+2;
		}

	}

}
