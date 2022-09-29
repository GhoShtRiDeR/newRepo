package com.day7;

public class Range_ofPrimeNumbers_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		while(i<=20)
		{
			int num=i;
			boolean isPrime=true;
			
			int j=2;
			while(j<num)
			{
				if(num%j==0)
				{
					isPrime=false;
					break;
				}
				j++;
			}
			if(isPrime==true)
			{
				System.out.print(num+" ");
			}
			i++;
		}

	}

}
