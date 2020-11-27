package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		//캡슐화떄문에 사용 불가
		/*camera.name = "nikon";
		camera.price = 40000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);*/
		
		camera.setName("nikon");
		System.out.println(camera.getName);
		
		camera.setName(n);
		String name = camera.getName();
		System.out.println(name);
		
		//Goods computer =new Goods();
		
		/*computer.name= "LG gram";
		computer.price = 500000;
		
		
	System.out.println(computer.name);
	System.out.println(computer.price);

	Goods mug = new Goods();
	mug.name = "star";
	mug.price = 20000;
	
	System.out.println(mug.name);
	System.out.println(mug.price);
		
	}

}*/
