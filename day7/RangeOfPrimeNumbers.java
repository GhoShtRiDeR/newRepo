package com.day7;

public class RangeOfPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=20;i++)
		{
			int num=i;
			boolean isPrime=true;
			
			for(int j=2;j<num;j++)
			{
				if(num%j==0)
				{
					isPrime=false;
					break;
				}			
			}
			if(isPrime==true)
			{
				System.out.print(num+" ");
			}
		}
	}
}