package com.fourSided.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fourSided.Shape.Point;
import com.fourSided.Shape.ShapeException;
import com.fourSided.Shape.Square;

public class SquareTest {

	Point p1 = new Point(0, 0);
	Point p2 = new Point(0, 2);
	Point p3 = new Point(2, 2);
	Point p4 = new Point(2, 0);
	
	Point p5 = new Point(10, 15);
	
	Square square = new Square(p1, p2, p3, p4);
	Square notSquare = new Square(p1, p2, p3, p5);
	
	@Test
	public void testIsSquare() {
		try {
			assertTrue(square.isSquare());
		} catch (ShapeException e) {
			e.printStackTrace();
		}
		
		try {
			assertTrue(square.isSquare());
		} catch (ShapeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
