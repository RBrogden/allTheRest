package com.fourSided.Shape;

public class ShapeException extends Exception {

	public ShapeException(Quadrilateral q, Point a, Point b, Point c, Point d){
			super("The following coordinates cannot be used to make a " + q.getClass() + " Points given where " + a + " " + b + " " + c + " " + d + "These points are invalid" );
	}
}
