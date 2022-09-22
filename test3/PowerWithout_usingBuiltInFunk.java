package test3;

import java.util.Scanner;

public class PowerWithout_usingBuiltInFunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base: ");
		int base=sc.nextInt();
		System.out.println("Enter index: ");
		int index=sc.nextInt();
		
		int ans=1;
		
		for(int i=1;i<=index;i++)
		{
			ans=ans*base;
		}
		System.out.println(base+" to the power "+index+" = "+ans);

	}

}
