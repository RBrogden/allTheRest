package com.fourSided.Shape;

public class Parallelogram extends Trapezium{


	public Parallelogram(Point one, Point two, Point three, Point four) throws ShapeException
	{
		super(one, two, three, four);	
		isParallelogram(this);
	}

	public boolean isParallelogram(Parallelogram parallelogram) throws ShapeException
	{
		Line line1 = getSide1();
		Line line2 = getSide2();
		Line line3 = getSide3();
		Line line4 = getSide4();
		if ((line1.getLength() == line3.getLength())
				||(line2.getLength() == line4.getLength()))				
		{
			return true;
		}
		else
		{
			throw new ShapeException(new Parallelogram(getPoint1(), getPoint2(), getPoint3(), getPoint4()), getPoint1(), getPoint2(), getPoint3(), getPoint4());
		}
	}		

	@Override
	public double getArea() 
	{		
		return Math.abs((getSide1().p1.getY() - getSide2().p1.getY()) * getSide2().getLength());
	}



}
