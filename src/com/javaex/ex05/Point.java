package com.javaex.ex05;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;

	}

	public Point() {
		super();
	}

	public Point(int x) {
		super();
		this.x = x;
	}
	
	
	//can not use// public Point(int y) {
		//super();
		//this.y = y;
	//}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void drawPoint() {
		System.out.println("점[x ="+ x +", y="+ y +"]을 그렸습니다.");
	}
}
