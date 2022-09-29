package com.day12;

public class Car {
	private long modelNo;
	private double price,speed;
	private String name;
	
	public void setModelNo(long modelNo) {
		this.modelNo=modelNo;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSpeed(double speed) {
		this.speed=speed;
	}
	public long getModelNo() {
		return modelNo;
	}
	public double getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public double getSpeed() {
		return speed;
	}
}
