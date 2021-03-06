/**
 * 
 */
package com.fourSided.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fourSided.Shape.Point;
import com.fourSided.Shape.Quadrilateral;
import com.fourSided.Shape.Rectangle;
import com.fourSided.Shape.ShapeException;

/**
 * @author Administrator
 *
 */
public class RectangleTest {
	
	@Test
	public void testRectangle1() throws ShapeException{
		Point point1= new Point(0,3);
		Point point2= new Point(2,3);
		Point point3= new Point(2,0);
		Point point4= new Point(0,0);
		Rectangle rectangle=new Rectangle(point1,point2,point3,point4);
	}
	
	@Test(expected=Exception.class)
	public void testRectangle2() throws ShapeException {
		Point point1= new Point(0,4);
		Point point2= new Point(2,3);
		Point point3= new Point(2,0);
		Point point4= new Point(0,0);
		Rectangle rectangle=new Rectangle(point1,point2,point3,point4);
	}


	@Test
	public void testGetArea() throws ShapeException {
		Point point1= new Point(0,3);
		Point point2= new Point(2,3);
		Point point3= new Point(2,0);
		Point point4= new Point(0,0);
		Rectangle rectangle=new Rectangle(point1,point2,point3,point4);
		assertEquals(rectangle.GetArea(),6,0.1);
		
	}

}
