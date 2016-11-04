package com.fourSided.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fourSided.Shape.Point;
import com.fourSided.Shape.Quadrilateral;
import com.fourSided.Shape.ShapeException;
import com.fourSided.Shape.Trapezium;

public class TrapeziumTest {

	@Test
	public void isTrapezziumTestPass() throws ShapeException {
		
		Point point1 = new Point(0.0, 0.0);
		Point point2 = new Point(4.0, 5.0);
		Point point3 = new Point(8.0, 5.0);
		Point point4 = new Point(12.0, 0.0);
		Quadrilateral test = new Trapezium(point1, point2, point3, point4);
	 
		assertTrue(Trapezium.isTrapezium(test));		
	}
	
	@Test(expected = ShapeException.class)
	public void isTrapezziumTestException() throws ShapeException {
		
		Point point1 = new Point(0.0, 0.0);
		Point point2 = new Point(4.0, 5.0);
		Point point3 = new Point(8.0, 5.0);
		Point point4 = new Point(12.0, 1.0);
		Quadrilateral test = new Trapezium(point1, point2, point3, point4);
	 	
		assertFalse(Trapezium.isTrapezium(test));
		
		
	}
	
	 
		
		

}
