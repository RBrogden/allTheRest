package com.fourSided.Shape;

public class Line {
	Point p1; 
	Point p2;	
	
	public Line(Point point1, Point point2){		
		p1 = point1;
		p2 = point2;		
	}



	public Point getP1() {
		return p1;
	}



	public void setP1(Point p1) {
		this.p1 = p1;
	}



	public Point getP2() {
		return p2;
	}



	public void setP2(Point p2) {
		this.p2 = p2;
	}
	
	public double getLength(){
				
		return p1.distanceTo(p2);
		
	}
	
	
	public double getSlope(Point p1, Point p2){
				
		return (p1.getY()-p2.getY()) / (p1.getX() - p2.getX());
		
		
	}
	
	
	

}
