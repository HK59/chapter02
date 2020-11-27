package com.javaex.ex05;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//default
	Point p01 = new Point(0, 0);
	p01.setX(1);
	p01.setY(5);
	p01.drawPoint();
	
	//point(int x, int y)
	
	Point p02 = new Point (10, 20);
	
	p02.drawPoint();
	
	//only x
	Point p03 = new Point(100);
	p03.setY(200);
	p03.drawPoint();
	}

	//only y
	//setX
	//use draw
	
}
