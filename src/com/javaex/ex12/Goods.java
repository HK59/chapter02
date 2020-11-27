package com.javaex.ex12;

public class Goods {

	//field
	private String name;
	private int price;
	
	
	//constructor
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}


	//getter/setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println("상품명: " + name + ",  가격:" + price);
	}
	
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}


	
	
}
	
	
	



