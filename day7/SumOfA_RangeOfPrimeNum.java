package com.day7;

public class SumOfA_RangeOfPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
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
			if(isPrime)
			{
				sum=sum+num;
			}
		}
		System.out.print("Sum of prime numbers between 1 to 20 is "+sum);
	}
}