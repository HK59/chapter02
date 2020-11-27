package com.javaex.ex12;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//array for managing the goods (make flats) (1)
		Goods[] goodsArray = new Goods[3];
		
		
		//(2)(3)(4)
		Goods camera = new Goods("Nickon", 400000);
		Goods computer = new Goods("LG gram", 100000);
		Goods cup = new Goods("Mug", 2000);
	
		//(5)
		goodsArray[0] = camera; 
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		
		System.out.println(camera.getName());
		System.out.println(goodsArray[0].getName());
		
		for (int i=0; i<goodsArray.length; i++) {
			/*
	    	System.out.println(goodsArray[i].getName());
	    	System.out.println(goodsArray[i].getPrice());
	    	
	    	System.out.println(goodsArray[i].toString());
	    	*/
			goodsArray[i].showInfo();
	    }
		
		  //같은 곳을 가리키고 있다
	    cup.setPrice(9000);
	    System.out.println(goodsArray[2].getPrice()); //9000
				
	
	}

}
