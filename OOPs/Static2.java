package com.OOPs;

public class Static2 {
	static int x=20;
	int y=30;
	
	public void put() {
		System.out.println(x+" "+y);
		y=45;
	}
	
	public static void show() {
		Static2 ob=new Static2();
		System.out.println(x+" "+ob.y);
		ob.put();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//System.out.println(x);
		//System.out.println(new Static2().x);
		
		//new Static2().put();
		Static2.show();
	}

}
