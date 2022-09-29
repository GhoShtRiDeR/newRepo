package com.day6;

public class DemoStuff1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*for(int i=1;i<=30;i++)
	{
		if(i%2==0||i%3==0)
			continue;
		else
			System.out.println(i);
	}*/
		
		
		for(int i=1;i<=20;i++)
		{
			if(i%2==1)
				continue;
			else if(i%3==0)
				break;
			else
				System.out.println(i);
				
		}
		
	}

}
