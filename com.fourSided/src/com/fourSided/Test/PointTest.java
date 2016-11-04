package com.fourSided.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fourSided.Shape.Point;

public class PointTest {

	@Test
	public void distanceToTest() {
		Point p=new Point(1,1);
		Point p1=new Point(2,2);
		double distance=p1.distanceTo(p);
		assertEquals(1.5,distance,0.1);
	}
	
	
	@Test
	public void toStringTest(){
		Point p=new Point(1,1);
		String point=p.toString();
		assertEquals("X:1.00, Y:1.00",point);
	}
	

}
