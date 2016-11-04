package com.fourSided.Shape;

public class Point {
	private double x;
	private double y;
	
	/**
	 * @return the x coordinate
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * @param x the x coordinate to set
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * @return the y coordinate
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * @param y the y to set coordinate
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	public Point(double xIn, double yIn){
		this.x=xIn;
		this.y=yIn;
	}
	
	public double distanceTo(Point point){
		return 0;
	
	}
	
	public String toString(){
		return null;
	}
	
	
}
