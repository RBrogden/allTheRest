package com.fourSided.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fourSided.Shape.Parallelogram;
import com.fourSided.Shape.Point;
import com.fourSided.Shape.ShapeException;

public class ParallelogramTest {

	Point p1 = new Point(0, 0);
	Point p2 = new Point(2, 2);
	Point p3 = new Point(6, 2);
	Point p4 = new Point(4, 0);
	
	Point p5 = new Point(10, 3);
	
	Parallelogram parallelogram = new Parallelogram(p1, p2, p3, p4);
	Parallelogram notParallelogram = new Parallelogram(p1, p2, p3, p5);
	
	
	@Test
	public void testGetArea() {
		assertEquals(parallelogram.getArea(), 8, 0);
	}

	@Test
	public void testIsParallelogram() {
		try {
			assertTrue(parallelogram.isParallelogram());
		} catch (ShapeException e) {
			e.printStackTrace();
		}
		try {
			assertTrue(notParallelogram.isParallelogram());
		} catch (ShapeException e) {
			e.printStackTrace();
		}
	}

}
