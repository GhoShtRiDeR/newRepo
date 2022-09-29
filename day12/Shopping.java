package com.day12;

public class Shopping {
	public int quantity;
	public double pricePerItem;
	public String purchaseItem;
	public double bill;
	
	public void acceptShoppingDetails(String item,int quant,double prise) {
		purchaseItem=item;
		quantity=quant;
		pricePerItem=prise;
		calculateBill(quantity,pricePerItem);
	}
	
	public void calculateBill(int quant,double prise) {
		if(quant>0)
			bill=quant*prise;
		else
			System.out.println("Error");
	}
	
	public void display() {
		
		System.out.println("Item Purchased:- "+purchaseItem);
		System.out.println("Quantity:- "+quantity);
		System.out.println("Bill Total:- "+bill);
		System.out.println("=================================");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping ob=new Shopping();
		
		ob.acceptShoppingDetails("Denim pant", 2, 1450.5);
		ob.display();
		
	}

}
