package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		camera.setName("Nickon");
		camera.setPrice(400000);
		System.out.println(camera.getTotalCount());
		
		Goods computer = new Goods("LG gram", 1000000);
		System.out.println(computer.getTotalCount());
		
		Goods cup = new Goods ("Mug");
		cup.setPrice(2000);
		System.out.println(cup.getTotalCount());
		
		System.out.println(camera.toString());
		
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
		
	}
	

}
