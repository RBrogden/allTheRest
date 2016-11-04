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
		
	@Test
	public void testIsSquare() {
		
		Square square;
		try {
			square = new Square(p1, p2, p3, p4);
			assertTrue(square.isSquare(square));
		} catch (ShapeException e1) {
			e1.printStackTrace();
		}	
	}
	
	@Test(expected = ShapeException.class)
	public void testIsSquareException() throws ShapeException {
		Square notSquare = new Square(p1, p2, p3, p5);		
	}

}
