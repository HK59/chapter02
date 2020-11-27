package com.javaex.ex01_01;

public class GoodsApp {

	public static void main(String[] args, char[] name) {
		// TODO Auto-generated method stub
		
		//camera
		Goods camera = new Goods();
		
		camera.setName("nickon");
		String cameraname = camera.getName();
		System.out.println(cameraname);
		
		camera.setPrice(400000);
		int cameraPrice = camera.getPrice(cameraPrice);
		System.out.println(cameraPrice);
		
		camera.showinfo();
		
		
		System.out.println("상품이름 : "+ cameraname +", 가격: " + cameraPrice );
		
		
		//computer
		Goods computer = new Goods();
		computer.setName("LG gram");
		String computerName = computer.getName();
		System.out.println(computerName);
		

		computer.setPrice(1000000);
		int p = 0;
		int computerPrice = computer.getPrice(p);
		System.out.println(computerPrice);
		
		System.out.println("상품이름 : "+ computerName +", 가격: " + computerPrice);
		
		computer.showinfo();{
			System.out.println("상품이름 : "+ name +", 가격: " + price);
		}
	}

}
