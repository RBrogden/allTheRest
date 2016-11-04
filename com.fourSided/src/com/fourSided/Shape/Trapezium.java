package com.fourSided.Shape;

public class Trapezium extends Quadrilateral {
	
	private double longBase;
	private double shortBase;
	private double slantingSide1;
	private double slantingSide2;
	
	public Trapezium(Point pointA, Point pointB, Point pointC, Point pointD) throws ShapeException {
		super(pointA, pointB, pointC, pointD);
		Trapezium.isTrapezium(this);
	}
		
	/**
	 * Checks to see if the quadrilateral is a trapezium
	 * 
	 * @return bool
	 * @throws ShapeException 
	 */
	public static boolean isTrapezium(Quadrilateral q) throws ShapeException
	{
		boolean returnValue =false;
		
		Line line1 = q.getSide1();
		Line line2 = q.getSide2();
		Line line3 = q.getSide3();
		Line line4 = q.getSide4();
		
		double slopeLine1 = line1.getSlope(line1.getP1(), line1.getP2());
		double slopeLine2 = line2.getSlope(line2.getP1(), line2.getP2());
		
		double slopeLine3 = line3.getSlope(line3.getP1(), line3.getP2());
		double slopeLine4 = line4.getSlope(line4.getP1(), line4.getP2());
		
		if ((slopeLine1 == slopeLine3) || (slopeLine2 == slopeLine4)){
			returnValue = true;
		}
		else {
			throw new ShapeException(q, q.getPoint1(), q.getPoint2(),q.getPoint3(),q.getPoint4());
		}
		
		return returnValue;
				
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
