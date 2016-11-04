package com.fourSided.Shape;

public class Square extends Rectangle{
	
	
	public Square(Point one, Point two, Point three, Point four) throws ShapeException
	{
		super(one, two, three, four);
		isSquare(this);
	}
	
	public boolean isSquare(Square square) throws ShapeException
	{
		if (getSide1().getLength() == getSide2().getLength() 
				&& getSide1().getLength() == getSide3().getLength()
				&& getSide1().getLength() == getSide4().getLength())
		{
			return true;
		}
		else
		{
			throw new ShapeException(new Square(getPoint1(), getPoint2(), getPoint3(), getPoint4()), getPoint1(), getPoint2(), getPoint3(), getPoint4());
		}
	}
}
