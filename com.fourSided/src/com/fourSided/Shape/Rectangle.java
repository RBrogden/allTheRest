package com.fourSided.Shape;

public class Rectangle extends Parallelogram{

	public Rectangle(Point point1, Point point2, Point point3,Point point4) throws ShapeException {
		super(point1, point2, point3, point4);
		Rectangle.isRectangle(this);
	}
	
	static public boolean isRectangle(Quadrilateral q) throws ShapeException{
		Line line1=q.getSide1();
		Line line2=q.getSide2();
		Line line3=q.getSide3();
		Line line4=q.getSide4();
		if(line1.getSlope(line1.getP1(), line1.getP2())==line3.getSlope(line3.getP1(), line3.getP2())){
			if ((line1.getLength()==line3.getLength())&(line2.getLength()==line4.getLength())){
					return true;
			}
		}
		else{
			throw new ShapeException(q,q.getPoint1(),q.getPoint2(),q.getPoint3(),q.getPoint4());
		}
		return false;
	}
	
	
	public double GetArea() {
		Line line1=getSide1();
		Line line2=getSide2();
		double length=line1.getLength();
		double width=line2.getLength();
		double area=length*width;
		return area;
	}
	
}
