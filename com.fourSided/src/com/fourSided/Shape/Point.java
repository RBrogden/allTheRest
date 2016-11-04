package com.fourSided.Shape;

import java.text.DecimalFormat;

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
		double newX=point.getX();
		double newY=point.getY();
		double diffrenceX=newX-x;
		double diffrenceY=newY-y;
		double distance=Math.sqrt((diffrenceX*diffrenceX)+(diffrenceY*diffrenceY));
		return distance;
	
	}
	
	public String toString(){
		DecimalFormat df= new DecimalFormat("0.00");
		String stringX=df.format(x);
		String stringY=df.format(y);
		String result=("X:"+stringX+", Y:"+stringY);
		return result;
	}
	
	
}
