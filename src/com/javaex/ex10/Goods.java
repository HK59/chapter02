package com.javaex.ex10;

public class Goods {
	
	private String name; 
	private int price;
	public static int totalCount; 
	
	//constructor
	
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		totalCount = totalCount +1; 
	}

	public Goods(String name) {
		super();
		this.name = name;
		totalCount = totalCount +1; 
	}

	public Goods() {
		super();
		totalCount = totalCount +1; 

	}
	
	
//method g/s
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

	
public int getTotalCount() {
		return totalCount;
	}

	//general methos
	public void showInfo() {
		System.out.println("상품명 : "+ name + ", 가격: " + price);
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalCount=" + totalCount + "]";
	}

	
	
	
	
	

}
