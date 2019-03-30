package com.usc.javabasics;

abstract class Cycle {
	private int x;
	private int y;
	
	Cycle(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	abstract int getSum();
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	public String toString(){
		return x +" " + y;
	}

}
