package test4;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		double sale,comm;
		sale=sc.nextDouble();
		
		comm=(sale>15000)?(sale*5/100):(0.0);
		System.out.println(comm);
	}

}
