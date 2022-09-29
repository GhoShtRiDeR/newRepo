package com.day17;

class Engine {

	String type;// (VEE,INLINE,STRAIGHT,VR and W,BOXER,ROTARY)

	Engine(String type) {
		this.type = type;
	}

	public String toString() {

		return type;
	}
}

class Gear {

	String gearType;// (AutoMatic,Semi AutoMatic,Manual.CVT)

	Gear(String gearType) {

		this.gearType = gearType;
	}

	public String toString() {

		return gearType;
	}
}

public class Car {

	int modelNo;
	double price;
	String name;
	Engine engineType;
	Gear gearType;

	Car(int modelNo, double price, String name, Engine engineType, Gear gearType) {
		this.modelNo = modelNo;
		this.price = price;
		this.name = name;
		this.engineType = engineType;
		this.gearType = gearType;
	}

	public String toString() {

		return modelNo + " " + price + " " + name + " " + engineType + " " + gearType;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car hyundai = new Car(1234, 899999.50, "i20", new Engine("BOXER"), new Gear("Manual"));
		System.out.println(hyundai.toString());
	}

}
