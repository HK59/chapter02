package com.javaex.ex02;

public class Point {
	private int x;
	private int y;
	
	
	//showinfo
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


	public void drawPoint (int x,y) {
		System.out.println("점[+ x ="+ x +", y="+ y +"]을 그렸습니다.");
	}

	

 }
