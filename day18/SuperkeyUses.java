package com.day18;


class ParentClass{
	
	int favNum;
	ParentClass(int n){
		favNum=n;
	}
	
	void display() {
		
		System.out.println(favNum);
	}
	
	
}
public class SuperkeyUses extends ParentClass {
	
	int favNum;
	SuperkeyUses(int n1,int n2){
		super(n1);
		this.favNum=n2;
	}
	void display() {
		super.display();
		super.favNum=1;
		favNum=3;
		System.out.println(super.favNum+" "+favNum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperkeyUses obj = new SuperkeyUses(7,2);
		obj.display();
	}

}
