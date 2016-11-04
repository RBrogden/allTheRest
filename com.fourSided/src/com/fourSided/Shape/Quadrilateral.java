package com.fourSided.Shape;

public abstract class Quadrilateral {

	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;

	private Line side1;
	private Line side2;
	private Line side3;
	private Line side4;
	
	/**
	 * Construct a quadrilateral object
	 * 
	 * @param pointA
	 * @param pointB
	 * @param pointC
	 * @param pointD
	 */
	public Quadrilateral(Point pointA, Point pointB, Point pointC, Point pointD) 
	{
		point1 = pointA;
		point2 = pointB;
		point3 = pointC;
		point4 = pointD;
		
		//Point 1
		side1 = new Line(pointA, pointB);
		side2 = new Line(pointB, pointC);
		side3 = new Line(pointC, pointD);
		side4 = new Line(pointD, pointA);
		
		
	}
	
	/**
	 * Takes the lenghts of the 4 sides and adds them together 
	 * 
	 * @return perimeter
	 */
	public double getPerimeter() 
	{
		return side1.getLength() + side2.getLength() + side3.getLength() + side4.getLength();
		
	}
	
	/**
	 * All Classes that extend quadrilateral
	 * Must implement this code body
	 * 
	 */
	public abstract double getArea();
	
	/**
	 * 
	 */
	public String toString() 
	{
		return "Information about this shape; \n"
				+ "Co-ordinates: "
				+ point1.toString() + " " + point2.toString() + " " + point3.toString() + " " + point4.toString() + "\n"
				+ "Line lengths: " 
				+ side1.getLength() + " " + side2.getLength() + " " + side3.getLength() + " " +  side4.getLength() + "\n"
				+ "Perimeter of shape: "
				+ getPerimeter() + "\n"
				+ "The area of the shape: " 
				+ getArea();
		
				
	}
	
	
	/**
	 * @return the point1
	 */
	public Point getPoint1() {
		return point1;
	}

	/**
	 * @param point1
	 *            the point1 to set
	 */
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	/**
	 * @return the point2
	 */
	public Point getPoint2() {
		return point2;
	}

	/**
	 * @param point2
	 *            the point2 to set
	 */
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	/**
	 * @return the point3
	 */
	public Point getPoint3() {
		return point3;
	}

	/**
	 * @param point3
	 *            the point3 to set
	 */
	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

	/**
	 * @return the point4
	 */
	public Point getPoint4() {
		return point4;
	}

	/**
	 * @param point4
	 *            the point4 to set
	 */
	public void setPoint4(Point point4) {
		this.point4 = point4;
	}

	/**
	 * @return the side1
	 */
	public Line getSide1() {
		return side1;
	}

	/**
	 * @param side1
	 *            the side1 to set
	 */
	public void setSide1(Line side1) {
		this.side1 = side1;
	}

	/**
	 * @return the side2
	 */
	public Line getSide2() {
		return side2;
	}

	/**
	 * @param side2
	 *            the side2 to set
	 */
	public void setSide2(Line side2) {
		this.side2 = side2;
	}

	/**
	 * @return the side3
	 */
	public Line getSide3() {
		return side3;
	}

	/**
	 * @param side3
	 *            the side3 to set
	 */
	public void setSide3(Line side3) {
		this.side3 = side3;
	}

	/**
	 * @return the side4
	 */
	public Line getSide4() {
		return side4;
	}

	/**
	 * @param side4
	 *            the side4 to set
	 */
	public void setSide4(Line side4) {
		this.side4 = side4;
	}
	
	

}
