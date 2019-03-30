package com.usc.javabasics;

class Bicycle extends Cycle implements Wheel{
	int z;
	
	Bicycle(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	
	@Override
	int getSum() {
		return super.getX() + super.getY() + this.z;
	}
	
	@Override
	public String toString() {
		return super.toString() +" "+ this.z;
	}
	
	@Override
	public int getSquare() {
		return a*a;	
	}
}