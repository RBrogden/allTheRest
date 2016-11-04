package com.fourSided.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fourSided.Shape.Line;
import com.fourSided.Shape.Point;

public class LineTest {

	Point p1 = new Point(1, 1);
	Point p2 = new Point(5, 3);
	
	Line line = new Line(p1, p2);
	
	@Test
	public void testGetLength() {
		
		double expectedLength = p1.distanceTo(p2);
		
		assertEquals(line.getLength(), expectedLength, 0.1);
	}

	@Test
	public void testGetSlope() {
		
		double expectedSlope = (p1.getY()-p2.getY()) / (p1.getX() - p2.getX());
		
		assertEquals(line.getSlope(p1, p2), expectedSlope, 0.1);
		
	}
	
	@Test
	public void testGetP1() {
		
		Point expectedP1 = p1;
		
		assertEquals(line.getP1(), expectedP1);
	}

	@Test
	public void testSetP1() {
		
		Point newPoint = new Point(2, 2);
		line.setP1(newPoint);
		
		assertEquals(line.getP1(), newPoint);
	}

	@Test
	public void testGetP2() {
		
		Point expectedP2 = p2;
		
		assertEquals(line.getP2(), expectedP2);
	}

	@Test
	public void testSetP2() {
		Point newPoint = new Point(4, 6);
		line.setP2(newPoint);
		
		assertEquals(line.getP2(), newPoint);
	}
}
