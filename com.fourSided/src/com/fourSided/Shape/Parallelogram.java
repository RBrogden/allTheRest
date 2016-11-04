package com.fourSided.Shape;

public class Parallelogram extends Quadrilateral{


	public Parallelogram(Point one, Point two, Point three, Point four)
	{
		super(one, two, three, four);
		if (!isParallelogram())
		{
			//throw shapeException;
		}
	}

	public boolean isParallelogram()
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
			return false;
		}
	}		

	@Override
	public double getArea() 
	{		
		return Math.abs((getSide1().p1.getY() - getSide2().p1.getY()) * getSide2().getLength());
	}



}
