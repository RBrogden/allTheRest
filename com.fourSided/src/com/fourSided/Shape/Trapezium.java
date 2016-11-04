package com.fourSided.Shape;

public class Trapezium extends Quadrilateral {
	
	public Trapezium(Point pointA, Point pointB, Point pointC, Point pointD) {
		super(pointA, pointB, pointC, pointD);
		// TODO Auto-generated constructor stub
	}

	private double longBase;
	private double shortBase;
	private double slantingSide1;
	private double slantingSide2;
	
	/**
	 * Checks to see if the quadrilateral is a trapezium
	 * 
	 * @return bool
	 */
	public static boolean isTrapezium(Quadrilateral q)
	{
		return false;
	}
}
