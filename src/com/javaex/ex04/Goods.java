package com.javaex.ex04;

public class Goods {
	// field
	private String name;
	private int price;

	// constructure - upload it to the memory
	public Goods() {
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		
	}



	public Goods(String name) {
		this.name = name;
	}
	// method getter/setter

	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		int defaultPrice  = 0 ;
		if (price<0) {
			this.price = defaultPrice;
			
		}else if (price=0) {
			this.price = 0; 
		}
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

	// methos/general method

	public void showinfo(){
		System.out.println();
	}
}
