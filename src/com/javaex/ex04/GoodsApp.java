package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constructor Goods
		//use setter 
		//check it by showinfo() 
		
		Goods camera = new Goods(); 
		camera.setName("Nickon");
		camera.setPrice(4000000);
		camera.showinfo();
		
		
		//constructor Goods
		//with 2 parameter(String name, int price)
		//would not use setter
		//check it by showInfo;
		Goods computer = new Goods("LG gram", 10000000);
		//input memory together; with the coding
		computer.showinfo();
		
		//constructor Goods(String name);
		//use setter; but use setprice; bc name was used in Goods
		//check it by showInfo
		Goods cup = new Goods("Mug");
		cup.setPrice(2000);
		cup.showinfo();
		
		//
		
		
		
	}

}
